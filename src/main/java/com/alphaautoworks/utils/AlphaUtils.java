package com.alphaautoworks.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AlphaUtils {


    private AlphaUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+ responseMessage +"\"}", httpStatus);
    }
}
