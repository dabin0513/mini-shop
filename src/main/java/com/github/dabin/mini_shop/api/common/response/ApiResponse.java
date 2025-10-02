package com.github.dabin.mini_shop.api.common.response;

import com.github.dabin.mini_shop.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 공통 응답 객체
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private ErrorResponse errorResponse;

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(
                true,
                "요청이 성공했습니다.",
                data,
                null);
    }

    public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(true, message, data, null);
    }

    public static <T> ApiResponse<T> fail(ErrorCode errorCode) {
        ErrorResponse errorResponse = ErrorResponse.of(errorCode.getErrorCode(), errorCode.getMessage());
        return new ApiResponse<>(
                false,
                errorResponse.getMessage(),
                null,
                errorResponse
        );
    }

    public static <T> ApiResponse<T> fail(ErrorCode errorCode, String message) {
        ErrorResponse errorResponse = ErrorResponse.of(errorCode.getErrorCode(), errorCode.getMessage());
        return new ApiResponse<>(
                false,
                message,
                null,
                errorResponse
        );
    }
}
