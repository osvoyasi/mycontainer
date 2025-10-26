package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyContainerTest {

    @Test
    void testAddAndGet() {
        MyContainer<String> container = new MyContainer<>();
        container.add("A");
        container.add("B");

        assertEquals("A", container.get(0));
        assertEquals("B", container.get(1));
        assertEquals(2, container.size());
    }

    @Test
    void testRemove() {
        MyContainer<Integer> container = new MyContainer<>();
        container.add(10);
        container.add(20);
        container.add(30);
        container.remove(1);

        assertEquals(2, container.size());
        assertEquals(30, container.get(1));
    }

    @Test
    void testIndexOutOfBounds() {
        MyContainer<Integer> container = new MyContainer<>();
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(0));
    }
}
