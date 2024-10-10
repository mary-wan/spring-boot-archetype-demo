#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${groupId}.model.RequestWrapper;
import ${groupId}.model.ResponseWrapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;

public interface DemoService {

    ResponseEntity<ResponseWrapper> processRequest(RequestWrapper requestWrapper, HttpServletRequest httpServletRequest);
}
