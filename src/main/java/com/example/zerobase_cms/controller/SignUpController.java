package com.example.zerobase_cms.controller;

import com.example.zerobase_cms.client.application.SignUpApplication;
import com.example.zerobase_cms.domain.SignUpForm;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup")
@RequiredArgsConstructor
public class SignUpController {
    private final SignUpApplication signUpApplication;
//
//    @PostMapping
//    public ResponseEntity<String> customerSignUp(@RequestBody SignUpForm form) {
//        return ResponseEntity.ok(signUpApplication.customerSignUpForm(form));
//    }

    @PutMapping("/verify/customer")
    public ResponseEntity<String> verifyCustomer(String email, String code) {
        return
    }
}
