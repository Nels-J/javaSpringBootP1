package com.p1.javaspringbootp1.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void homeResponse() { //bad test
        String body = this.restTemplate.getForObject("/demo", String.class);
        assertThat(body).isEqualTo("Spring is here!");
    }

    @Test
    public void carById() {
        String body = this.restTemplate.getForObject("/cars/1", String.class);
        assertThat(body).isEqualTo("{\"id\":1,\"model\":\"Seven\",\"make\":\"Lotus\",\"color\":\"British Green\"}");
    }
}