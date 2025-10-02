package com.github.dabin.mini_shop.api.product.mapper;

import com.github.dabin.mini_shop.api.product.dto.request.CreateProductRequestDto;
import com.github.dabin.mini_shop.api.product.dto.response.CreateProductResponseDto;
import com.github.dabin.mini_shop.api.product.dto.response.GetProductResponseDto;
import com.github.dabin.mini_shop.domain.product.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoMapper {

    public GetProductResponseDto toGetResponseDto(Product product) {
        if (product == null) {
            return null;
        }

        return GetProductResponseDto.of(
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

    public Product toDomain(CreateProductRequestDto createProductRequestDto) {
        if (createProductRequestDto == null) {
            return null;
        }

        return Product.of(
                null,
                createProductRequestDto.getCategoryId(),
                createProductRequestDto.getStockId(),
                createProductRequestDto.getName(),
                createProductRequestDto.getSalePrice(),
                createProductRequestDto.getListPrice(),
                createProductRequestDto.getImageUrl(),
                createProductRequestDto.getProductStatus(),
                createProductRequestDto.getSalesCount(),
                createProductRequestDto.getCreatedAt(),
                createProductRequestDto.getUpdatedAt()
        );
    }

    public CreateProductResponseDto toCreateResponseDto(Product savedProduct) {
        if (savedProduct == null) {
            return null;
        }

        return CreateProductResponseDto.of(
                savedProduct.getId(),
                savedProduct.getCategoryId(),
                savedProduct.getStockId(),
                savedProduct.getName(),
                savedProduct.getSalePrice(),
                savedProduct.getListPrice(),
                savedProduct.getImageUrl(),
                savedProduct.getProductStatus(),
                savedProduct.getSalesCount(),
                savedProduct.getCreatedAt(),
                savedProduct.getUpdatedAt()
        );
    }
}
