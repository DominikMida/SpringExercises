package com.example.springexercises.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Store {

    private Item item;

    public Store(@Qualifier("ItemImpl1") Item item) {
        this.item = item;
    }

    public String show() {
        return item.name();
    }
}