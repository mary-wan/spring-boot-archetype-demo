package com.demo.main.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import jakarta.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder //Inheritance Support
public class RequestHeader {

    @NotNull(message = "messageID is required")
    private String messageID;

    @NotNull(message = "serviceCode is required")
    private String serviceCode;

    @NotNull(message = "serviceName is required")
    private String serviceName;

    @NotNull(message = "timeStamp is required")
    private String timeStamp;
}
