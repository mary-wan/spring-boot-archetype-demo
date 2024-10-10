package com.demo.main.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder //Inheritance Support
public class ResponseWrapper {

    private ResponseHeader header;
    private Object responsePayload;

}
