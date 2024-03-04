package com.example.springexercises.config;

import com.example.springexercises.model.Item;
import com.example.springexercises.model.ItemImpl1;
import com.example.springexercises.model.ItemImpl2;
import com.example.springexercises.model.Store;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    //    @Bean
//    public Item item1() {
//        return new ItemImpl1();
//    }
//    @Bean
//    public Item item2() {
//        return new ItemImpl2();
//    }

//    @Bean
//    public Store store() {
//        return new Store(item1());
//    }

}