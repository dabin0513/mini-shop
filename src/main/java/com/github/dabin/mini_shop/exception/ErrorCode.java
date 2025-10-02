package com.github.dabin.mini_shop.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *  커스텀 에러 코드
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {
    // 상품관련 에러
    PRODUCT_NOT_FOUND("P001", "상품을 찾을 수 없습니다."),


    // 서버 에러
    UNEXPECTED_ERROR("UN001", "에상치 못한 에러가 발생했습니다.");

    private final String errorCode;
    private final String message;
}
