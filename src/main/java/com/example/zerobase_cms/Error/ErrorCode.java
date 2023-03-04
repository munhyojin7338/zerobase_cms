package com.example.zerobase_cms.Error;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    ALREADY_REGISTER_USER(HttpStatus.BAD_REQUEST, "이미 가입된 회원입니다."),

    NOT_FOUND_USER(HttpStatus.BAD_REQUEST, "찾을 수없는 회원입니다,"),

    ALREADY_VERIFY(HttpStatus.BAD_REQUEST, "이미 인증이 완료되었습니다.");

    private final HttpStatus httpStatus;
    private final String detail;
}
