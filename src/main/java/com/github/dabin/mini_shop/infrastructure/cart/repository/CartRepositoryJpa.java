package com.github.dabin.mini_shop.infrastructure.cart.repository;

import com.github.dabin.mini_shop.domain.cart.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CartRepositoryJpa implements CartRepository {
    private final CartJpaRepository cartJpaRepository;
}
