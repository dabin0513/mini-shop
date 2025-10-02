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
    PRODUCT_NOT_FOUND("P001", "상품을 찾을 수 없습니다.");

    private final String errorCode;
    private final String message;
}
