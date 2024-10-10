package it.pkg.service;

import archetype.it.model.RequestWrapper;
import archetype.it.model.ResponseWrapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;

public interface DemoService {

    ResponseEntity<ResponseWrapper> processRequest(RequestWrapper requestWrapper, HttpServletRequest httpServletRequest);
}
