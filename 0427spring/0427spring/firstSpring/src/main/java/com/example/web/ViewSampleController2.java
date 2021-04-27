package com.example.web;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ViewSampleController {

    @ExceptionHandler(IOException.class)
    public String error() {
        return "errorByController";
    }

    @ExceptionHandler(Exception.class)
    public String errorAll() {
        return "errorAllByController";
    }

}