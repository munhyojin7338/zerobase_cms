package com.example.zerobase_cms.client.service.test;


import com.example.zerobase_cms.domain.SignUpForm;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SignUpCustomerServiceTest {

    @Autowired
    private SignUpCustomerService service;


    @Test
    void signUp() {
        // given
        SignUpForm form = SignUpForm.builder()
                .name("name")
                .birth(LocalDateTime.now())
                .email("123@123.com")
                .password("1234")
                .phone("01045107338")
                .build();

        // when
        // then
       }

}