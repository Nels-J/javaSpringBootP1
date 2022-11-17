package com.p1.javaspringbootp1.controller;

/*
 * @author nelsj
 * @Date 16/11/2022
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PingTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void isAliveTest() {
        String body = this.restTemplate.getForObject("/ping", String.class);
        assertThat(body).isEqualTo("Service UP");
    }

}
