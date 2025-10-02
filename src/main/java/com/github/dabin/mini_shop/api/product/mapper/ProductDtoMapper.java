package com.github.dabin.mini_shop.api.product.mapper;

import com.github.dabin.mini_shop.api.product.dto.request.ProductCreateRequestDto;
import com.github.dabin.mini_shop.api.product.dto.response.ProductGetResponseDto;
import com.github.dabin.mini_shop.domain.product.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoMapper {

    public ProductGetResponseDto toGetResponseDto(Product product) {
        if (product == null) {
            return null;
        }

        return ProductGetResponseDto.of(
                product.getId(),
                product.getCategoryId(),
                product.getStockId(),
                product.getName(),
                product.getSalePrice(),
                product.getListPrice(),
                product.getImageUrl(),
                product.getProductStatus(),
                product.getSalesCount(),
                product.getCreatedAt(),
                product.getUpdatedAt()
        );
    }
}
