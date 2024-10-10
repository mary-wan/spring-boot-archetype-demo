#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.service.DemoService;
import ${package}.utils.Variables;
import ${groupId}.model.RequestWrapper;
import ${groupId}.model.ResponseWrapper;
import ${groupId}.service.StarterService;
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
