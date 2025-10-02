package com.github.dabin.mini_shop.domain.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ProductStatus {
    VISIBLE("VISIBLE", "노출"),
    HIDDEN("HIDDEN", "비노출"),
    SOLD_OUT("SOLD_OUT", "품절"),
    DELETED("DELETED", "삭제");

    private String code;
    private String description;
}
