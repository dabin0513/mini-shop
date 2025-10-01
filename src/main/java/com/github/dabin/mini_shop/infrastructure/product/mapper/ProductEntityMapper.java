package com.github.dabin.mini_shop.infrastructure.product.mapper;

import com.github.dabin.mini_shop.domain.product.model.Product;
import com.github.dabin.mini_shop.infrastructure.product.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityMapper {

    public Product toDomain(ProductEntity productEntity) {
        if (productEntity == null) {
            return null;
        }

        return Product.of(
                productEntity.getId(),
                productEntity.getCategoryId(),
                productEntity.getStockId(),
                productEntity.getName(),
                productEntity.getSalePrice(),
                productEntity.getListPrice(),
                productEntity.getImageUrl(),
                productEntity.getProductStatus(),
                productEntity.getSalesCount(),
                productEntity.getCreatedAt(),
                productEntity.getUpdatedAt()
        );
    }
}
