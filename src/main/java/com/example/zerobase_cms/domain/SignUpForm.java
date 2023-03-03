package com.example.zerobase_cms.domain;


import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpForm {
    private String email;
    private String name;
    private String password;
    private LocalDateTime birth;
    private String phone;

}
