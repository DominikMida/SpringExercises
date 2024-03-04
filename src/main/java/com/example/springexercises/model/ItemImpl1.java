package com.example.springexercises.model;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data
@Component("ItemImpl1")
public class ItemImpl1 implements Item {
    @Override
    public String name() {
        return "Komputer";
    }
}
