package com.demo.main.exception;

import com.demo.main.model.ResponseWrapper;
import com.demo.main.service.StarterService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.demo.main.utils.Variables.CONVERSATION_ID;


@RequiredArgsConstructor
@RestControllerAdvice
public class StarterExceptionHandler {

    private final StarterService starterService;

    @ExceptionHandler(StarterBadRequestException.class)
    protected ResponseEntity<ResponseWrapper> handleBadRequest(StarterBadRequestException e, HttpServletRequest request) {
        return starterService.mapResponseWrapper(HttpStatus.BAD_REQUEST,HttpStatus.BAD_REQUEST.value(),
                request.getHeader(CONVERSATION_ID), e.getMessage(),null);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ResponseWrapper> handleValidationExceptions(MethodArgumentNotValidException e, HttpServletRequest request) {
        String errorMessage = e.getBindingResult().getFieldErrors().stream()
                .findFirst()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .orElse("Validation failed: Unknown error");

        return starterService.mapResponseWrapper(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.value(),
                request.getHeader(CONVERSATION_ID), "Validation failed: " + errorMessage, null);
    }

}
