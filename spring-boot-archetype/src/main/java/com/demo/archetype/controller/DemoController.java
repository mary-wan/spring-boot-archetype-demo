package com.demo.archetype.controller;

import com.demo.main.model.RequestWrapper;
import com.demo.main.model.ResponseWrapper;
import com.demo.archetype.service.DemoService;
import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class DemoController {

    private final DemoService demoService;

    @PostMapping("/test")
    public ResponseEntity<ResponseWrapper> starterTest(@Valid @RequestBody RequestWrapper requestWrapper, HttpServletRequest httpServletRequest){
        return demoService.processRequest(requestWrapper,httpServletRequest);
    }
}
