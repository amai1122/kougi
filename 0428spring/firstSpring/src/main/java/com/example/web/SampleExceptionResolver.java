package com.example.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

//コントローラーでキャッチできないエラーの処理

public class SampleExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
            Exception ex) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "予期せぬエラー"); // エラー画面に受け渡すデータ
        mav.setViewName("error"); // エラー画面のパスを指定
        return mav;
    }

}