package com.github.dabin.mini_shop.exception;

import com.github.dabin.mini_shop.api.common.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 전역 예외 처리
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiResponse<Object>> handleCustomException(CustomException e) {
        ApiResponse<Object> apiResponse = ApiResponse.fail(e.getErrorCode());
        return ResponseEntity.badRequest().body(apiResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Object>> handleException(Exception e) {
        ApiResponse<Object> apiResponse = ApiResponse.fail(ErrorCode.UNEXPECTED_ERROR, e.getMessage());
        return ResponseEntity.badRequest().body(apiResponse);
    }
}
