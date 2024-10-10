package com.demo.main.service.impl;

import com.demo.main.service.DemoService;
import com.demo.main.utils.Variables;
import com.demo.main.model.RequestWrapper;
import com.demo.main.model.ResponseWrapper;
import com.demo.main.service.StarterService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoServiceImp implements DemoService {

    private final StarterService starterService;

    @Override
    public ResponseEntity<ResponseWrapper> processRequest(RequestWrapper requestWrapper, HttpServletRequest httpServletRequest) {
        return starterService.mapResponseWrapper(HttpStatus.OK,HttpStatus.OK.value(),
                httpServletRequest.getHeader(Variables.CONVERSATION_ID), Variables.SUCCESS,null);
    }
}
