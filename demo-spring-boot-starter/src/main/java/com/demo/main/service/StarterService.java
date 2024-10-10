package com.demo.main.service;

import com.demo.main.model.ResponseWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface StarterService {

    String convertToString(Object object);

    <T> Optional<T> convertToObject(String jsonString, Class<T> type);

    ResponseEntity<ResponseWrapper> mapResponseWrapper(HttpStatus httpStatus, int statusCode,
                                                       String conversationId, String statusDescription, Object responseBody);

    String generateConversationId();

}
