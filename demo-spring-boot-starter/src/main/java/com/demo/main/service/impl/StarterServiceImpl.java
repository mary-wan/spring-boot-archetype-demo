package com.demo.main.service.impl;

import com.demo.main.logging.StarterLog;
import com.demo.main.model.ResponseHeader;
import com.demo.main.model.ResponseWrapper;
import com.demo.main.service.StarterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class StarterServiceImpl implements StarterService {
    private final ObjectMapper mapper;

    @Override
    public String convertToString(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("Serialization failed: {}",e.getMessage());
            return  null;
        }
    }

    @Override
    public <T> Optional<T> convertToObject(String jsonString, Class<T> type) {
        try {
            return Optional.ofNullable(mapper.readValue(jsonString, type));
        } catch (JsonProcessingException e) {
            log.error("Deserialization failed: {}",e.getMessage());
            return Optional.empty();
        }

    }

    @Override
    public ResponseEntity<ResponseWrapper> mapResponseWrapper(HttpStatus httpStatus,int statusCode,
                                                              String conversationId, String statusDescription, Object responseBody) {

        ResponseHeader header = new ResponseHeader(conversationId,statusCode,statusDescription);
        ResponseWrapper responseWrapper = new ResponseWrapper(header,responseBody);
        StarterLog.info(conversationId,null,statusCode,this.convertToString(responseBody));

        return new ResponseEntity<>(responseWrapper, httpStatus);
    }

    @Override
    public String generateConversationId() {
        return String.valueOf(UUID.randomUUID());
    }
}
