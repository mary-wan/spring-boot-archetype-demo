package com.demo.main.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
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
public class RequestWrapper {

    @Valid
    @NotNull(message = "header cannot be null")
    private RequestHeader header;
    private Object requestPayload;
}
