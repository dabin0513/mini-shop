package com.github.dabin.mini_shop.infrastructure.product.repository;

import com.github.dabin.mini_shop.infrastructure.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long> {
}
