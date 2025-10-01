package com.github.dabin.mini_shop.api.product.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductGetResponseDto {
    private Long id;
    private Long categoryId;
    private Long stockId;
    private String name;
    private Long salePrice;
    private Long listPrice;
    private String imageUrl;
    private String productStatus;
    private int salesCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static ProductGetResponseDto of(
            Long id, Long categoryId, Long stockId, String name,
            Long salePrice, Long listPrice, String imageUrl, String productStatus,
            int salesCount, LocalDateTime createdAt, LocalDateTime updatedAt
    ) {
        return new ProductGetResponseDto(
                id, categoryId, stockId, name, salePrice, listPrice,
                imageUrl, productStatus, salesCount, createdAt, updatedAt
        );
    }
}
