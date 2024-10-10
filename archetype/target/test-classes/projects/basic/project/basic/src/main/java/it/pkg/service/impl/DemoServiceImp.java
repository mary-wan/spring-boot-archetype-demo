package it.pkg.service.impl;

import it.pkg.service.DemoService;
import it.pkg.utils.Variables;
import archetype.it.model.RequestWrapper;
import archetype.it.model.ResponseWrapper;
import archetype.it.service.StarterService;
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
