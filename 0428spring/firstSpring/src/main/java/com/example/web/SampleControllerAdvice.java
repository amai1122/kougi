package com.example.web;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//例外処理

@ControllerAdvice
public class SampleControllerAdvice {

	@ExceptionHandler(IOException.class)
	public String error() {
		return "errorByControllerAdvice";
	}

	@ExceptionHandler(Exception.class)
	public String errorAll() {
		return "errorAllByControllerAdvice";
	}

}
