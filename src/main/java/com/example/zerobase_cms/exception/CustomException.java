package com.example.zerobase_cms.exception;

import com.example.zerobase_cms.Error.ErrorCode;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class CustomException extends RuntimeException{
    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getDetail());
        this.errorCode = errorCode;
    }
}
