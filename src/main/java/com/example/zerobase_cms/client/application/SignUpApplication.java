package com.example.zerobase_cms.client.application;


import com.example.zerobase_cms.Error.ErrorCode;
import com.example.zerobase_cms.client.MailgunClient;
import com.example.zerobase_cms.client.mailgun.SendMailForm;
import com.example.zerobase_cms.client.service.test.SignUpCustomerService;
import com.example.zerobase_cms.domain.SignUpForm;
import com.example.zerobase_cms.domain.model.Customer;
import com.example.zerobase_cms.exception.CustomException;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.utility.RandomString;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SignUpApplication {
    private final MailgunClient mailgunClient;
    private final SignUpCustomerService signUpCustomerService;

    public void customerVerify(String email, String code) {
        return;
    }

    public void customerSignUpForm(SignUpForm form) {
        if (signUpCustomerService.isEmailExist(form.getEmail())) {
            throw new CustomException(ErrorCode.ALREADY_REGISTER_USER);
        } else {
            Customer c = signUpCustomerService.signUp(form);
            LocalDateTime now = LocalDateTime.now();


            String code = getRandomCode();
            SendMailForm sendMailForm = SendMailForm.builder()
                    .from("tester@Hyojin.com")
                    .to(form.getEmail())
                    .subject("Verification Email")
                    .text(getVerificationEmailBody(form.getEmail(), form.getName(), getRandomCode()))
                    .build();
            mailgunClient.sendEmail(sendMailForm);
            signUpCustomerService.ChangeCustomerValidateEmail(c.getId(), code);
        }
    }

    private String getRandomCode() {
        return RandomStringUtils.random(10, true, true);
    }

    private String getVerificationEmailBody(String email, String name, String code) {
        StringBuilder builder = new StringBuilder();
        return builder.append("Hello").append(name).append("Please click!")
                .append("http://localhost:8081/customer/signup/verify?email")
                .append(email)
                .append("&code")
                .append(code).toString();
    }

}
