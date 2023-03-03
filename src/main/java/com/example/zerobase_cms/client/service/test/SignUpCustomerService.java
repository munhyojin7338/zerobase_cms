package com.example.zerobase_cms.client.service.test;


import com.example.zerobase_cms.domain.SignUpForm;
import com.example.zerobase_cms.domain.model.Customer;
import com.example.zerobase_cms.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpCustomerService {

    private final CustomerRepository customerRepository;

    public Customer signUp(SignUpForm form) {
        return customerRepository.save(Customer.from(form));
    }
}
