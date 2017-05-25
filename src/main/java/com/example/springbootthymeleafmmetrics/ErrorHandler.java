package com.example.springbootthymeleafmmetrics;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

@Component
public class ErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse clienthttpresponse) throws IOException {

        if (clienthttpresponse.getStatusCode() != HttpStatus.OK) {

            if (clienthttpresponse.getStatusCode() == HttpStatus.FORBIDDEN) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {

    }
}