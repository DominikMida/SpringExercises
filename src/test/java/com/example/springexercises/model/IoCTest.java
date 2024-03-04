package com.example.springexercises.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IoCTest {
    @Autowired
    private Store store;
    @Test
    public void test() {
//        Store store = new Store(new ItemImpl1());

        assertEquals("Komputer", store.show());
    }
}
