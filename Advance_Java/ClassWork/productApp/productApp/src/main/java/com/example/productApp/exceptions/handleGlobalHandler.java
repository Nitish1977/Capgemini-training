package com.example.productApp.exceptions;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class handleGlobalHandler {
    @ExceptionHandler(Exception.class)
    public String handleGlobalException(Exception ex, Model model){
        model.addAttribute("errorMessage","Something went to wrong "+ex.getMessage());
        return "error-page";
    }

}
