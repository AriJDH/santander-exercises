package com.example.demo.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.demo.controllers.ClienteController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteLayerController {

    @Autowired
    private ClienteController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}