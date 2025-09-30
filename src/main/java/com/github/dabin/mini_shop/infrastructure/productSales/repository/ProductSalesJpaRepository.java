package com.github.dabin.mini_shop.infrastructure.productSales.repository;

import com.github.dabin.mini_shop.infrastructure.productSales.entity.ProductSalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSalesJpaRepository extends JpaRepository<ProductSalesEntity, Long> {
}
