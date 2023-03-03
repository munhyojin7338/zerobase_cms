package com.example.zerobase_cms.client.mailgun;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendMailForm {
    private String from;
    private String to;
    private String subject;
    private String text;
}
