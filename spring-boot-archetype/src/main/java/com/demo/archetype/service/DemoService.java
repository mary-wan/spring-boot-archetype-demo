package com.demo.archetype.service;

import com.demo.main.model.RequestWrapper;
import com.demo.main.model.ResponseWrapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;

public interface DemoService {

    ResponseEntity<ResponseWrapper> processRequest(RequestWrapper requestWrapper, HttpServletRequest httpServletRequest);
}
