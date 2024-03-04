package com.example.springexercises.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class EmployeeControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void givenNoEmployee_whenCreateEmployee_thenEmployeeCreated() throws Exception {
        String result = "[{\"id\":1,\"name\":\"Mar\"},{\"id\":2,\"name\":\"Bog\"}]";
        mvc.perform(get("/employees"))
                .andExpect(content().contentType("application/json"))
                .andExpect(content().json(result));
    }
}