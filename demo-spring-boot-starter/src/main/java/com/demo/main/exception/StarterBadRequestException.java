package com.demo.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class StarterBadRequestException extends RuntimeException{

    public StarterBadRequestException(String message) {
        super(message);
    }

    public StarterBadRequestException() {
        super();
    }

    public StarterBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

}
