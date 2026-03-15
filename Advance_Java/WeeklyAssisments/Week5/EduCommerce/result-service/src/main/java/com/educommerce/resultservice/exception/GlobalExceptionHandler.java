package com.educommerce.resultservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> handleException(RuntimeException ex) {
        return ResponseEntity.badRequest().body(Map.of(
            "timestamp", LocalDateTime.now().toString(),
            "message", ex.getMessage()
        ));
    }
}
