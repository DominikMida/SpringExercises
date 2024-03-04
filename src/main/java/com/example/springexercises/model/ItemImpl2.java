package com.example.springexercises.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class ItemImpl2 implements Item {
    @Override
    public String name() {
        return "Telefon";
    }
}
