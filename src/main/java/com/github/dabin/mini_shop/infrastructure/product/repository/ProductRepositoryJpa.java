package com.github.dabin.mini_shop.infrastructure.product.repository;

import com.github.dabin.mini_shop.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryJpa implements ProductRepository {
    private final ProductJpaRepository productJpaRepository;
}
