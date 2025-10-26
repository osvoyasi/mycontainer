# MyContainer

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()

## Описание

`MyContainer` — это универсальный контейнер для хранения произвольного количества объектов.  
Особенности:

- Не использует стандартные коллекции Java (`ArrayList`, `LinkedList` и др.)  
- Поддерживает добавление, получение и удаление элементов  
- Масштабируется автоматически при переполнении внутреннего массива  
- Простая реализация на основе массива (`Object[]`)  

Этот проект реализован как учебная лабораторная работа с Maven, включая unit-тесты и документацию JavaDoc.

## Структура проекта

mycontainer/
├── pom.xml # Maven конфигурация
├── src/
│ ├── main/java/org/example/
│ │ └── MyContainer.java
│ └── test/java/org/example/
│ └── MyContainerTest.java
└── README.md

## Установка и запуск

// Клонируйте репозиторий:

git clone https://github.com/<YOUR_USERNAME>/mycontainer.git
cd mycontainer
mvn clean test

MyContainer<String> container = new MyContainer<>();

// Добавление элементов
container.add("Первый");
container.add("Второй");

// Получение элементов
String first = container.get(0);
System.out.println(first); // Выведет "Первый"

// Удаление элемента
container.remove(0);
System.out.println(container.get(0)); // Выведет "Второй"

Особенности реализации

Добавление элементов: автоматически расширяет массив при переполнении

Удаление элементов: сдвигает элементы влево, освобождая место

Общая структура: массив Object[] data + счётчик size

Unit-тесты: покрывают все основные методы контейнера (add, get, remove)

JavaDoc

Документация доступна через Maven:

mvn javadoc:javadoc


После этого открой файл:

target/site/apidocs/index.html
