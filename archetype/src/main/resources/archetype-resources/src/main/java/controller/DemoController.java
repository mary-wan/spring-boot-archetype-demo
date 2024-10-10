#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${groupId}.model.RequestWrapper;
import ${groupId}.model.ResponseWrapper;
import ${package}.service.DemoService;
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
