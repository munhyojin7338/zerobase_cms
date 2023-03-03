package com.example.zerobase_cms.client.service;


import com.example.zerobase_cms.config.FeignConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {
    @Autowired
    private EmailSendService emailSendService;

    @Test
    public void EmailTest() {
        // given
        String response = emailSendService.sendEmail();
        System.out.println(response);
        // when
        // then
    }

}