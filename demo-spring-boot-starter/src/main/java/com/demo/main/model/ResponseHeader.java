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
public class ResponseHeader {

    private String conversationID;
    private int statusCode;
    private String statusDescription;

}
