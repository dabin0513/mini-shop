package com.github.dabin.mini_shop.infrastructure.productSales.repository;

import com.github.dabin.mini_shop.domain.productSales.repository.ProductSalesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductSalesRepositoryJpa implements ProductSalesRepository {
    private final ProductSalesJpaRepository productSalesJpaRepository;
}
