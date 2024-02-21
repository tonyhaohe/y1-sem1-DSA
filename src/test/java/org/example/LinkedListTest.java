package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList list = new LinkedList(1);
    @BeforeEach
    void setUp(){
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);
        list.insertEnd(6);
    }

    @Test
    void testLinkedListConstructor(){
        assertEquals(1,list.valueAt(0));
    }
    @Test
    void insertBeg() {
        list.insertBeg(0);
        assertEquals(0,list.valueAt(0));
    }

    @Test
    void deleteBeg() {
        list.deleteBeg();
        assertThrows(NullPointerException.class,()->list.valueAt(0));
    }

    @Test
    void valueAt() {
        assertEquals(list.valueAt(5),6);
    }

    @Test
    void insertEnd() {
        list.insertEnd(7);
        assertEquals(list.valueAt(6),7);
    }

    @Test
    void deleteEnd(){
        list.deleteEnd();
        assertThrows(NullPointerException.class, ()->list.valueAt(5));
    }
}