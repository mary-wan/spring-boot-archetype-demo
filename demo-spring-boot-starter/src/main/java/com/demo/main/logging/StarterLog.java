package com.demo.main.logging;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class StarterLog {

    private static final String log_message = "Transaction:: ConversationId={} || RequestPayload={} || ResponseCode={} || ResponsePayload={} || ErrorMessage{}";

    public static void warn(String messageId, Object requestPayload,
                            int responseCode, Object responsePayload) {
        log.warn(log_message, messageId, requestPayload, responseCode,responsePayload,"");
    }

    public static void info(String messageId, Object requestPayload,
                            int responseCode, Object responsePayload) {
        log.info(log_message, messageId, requestPayload, responseCode,responsePayload,"");
    }


    public static void error(String messageId, Object requestPayload,
                            int responseCode, Object responsePayload,String errorMessage) {
        log.error(log_message, messageId, requestPayload, responseCode,responsePayload,errorMessage);
    }


}
