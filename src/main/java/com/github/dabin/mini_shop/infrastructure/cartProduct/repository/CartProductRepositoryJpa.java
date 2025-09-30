package com.github.dabin.mini_shop.infrastructure.cartProduct.repository;

import com.github.dabin.mini_shop.domain.cartProduct.repository.CartProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CartProductRepositoryJpa implements CartProductRepository {
    private final CartProductJpaRepository cartProductJpaRepository;
}
