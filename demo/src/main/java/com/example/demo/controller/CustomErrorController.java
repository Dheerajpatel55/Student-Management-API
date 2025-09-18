package com.example.demo.controller;

import java.util.*;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.*;


@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public Map<String, Object> handleError(HttpServletRequest request) {
        Map<String, Object> error = new HashMap<>();

        Object status = request.getAttribute("javax.servlet.error.status_code");
        Throwable exception = (Throwable) request.getAttribute("javax.servlet.error.exception");

        error.put("status", status != null ? status : 500);

        if (exception != null) {
            error.put("message", exception.getMessage());
            error.put("exception", exception.toString());
        } else {
            error.put("message", "No exception captured");
            error.put("exception", "none");
        }

        return error;
    }
}


