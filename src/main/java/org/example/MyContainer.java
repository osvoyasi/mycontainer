package org.example;

/**
 * Класс контейнер для хранения произвольного количества объектов.
 * Реализован на основе динамического массива.
 *
 * @param <T> тип элементов, хранимых в контейнере
 */
public class MyContainer<T> {

    private Object[] data;
    private int size;

    /**
     * Создает контейнер начальной вместимости 10 элементов.
     */
    public MyContainer() {
        data = new Object[10];
        size = 0;
    }

    /**
     * Добавляет элемент в контейнер.
     *
     * @param element элемент для добавления
     */
    public void add(T element) {
        if (size == data.length) {
            expandCapacity();
        }
        data[size++] = element;
    }

    /**
     * Возвращает элемент по индексу.
     *
     * @param index индекс элемента
     * @return элемент
     * @throws IndexOutOfBoundsException если индекс некорректен
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    /**
     * Удаляет элемент по индексу.
     *
     * @param index индекс удаляемого элемента
     */
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    /**
     * Возвращает текущее количество элементов.
     */
    public int size() {
        return size;
    }

    private void expandCapacity() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
    }
}

