package com.logikio.webassignment.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HostException
{

    @ExceptionHandler({ org.springframework.web.client.HttpClientErrorException.class })
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleHttpClientErrorException(
                    org.springframework.web.client.HttpClientErrorException ex) {
        return new ResponseEntity<>("Port 8085 is required but 8080 was accessed", HttpStatus.NOT_FOUND);
    }
}
