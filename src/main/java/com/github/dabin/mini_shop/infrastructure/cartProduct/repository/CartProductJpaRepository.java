package com.github.dabin.mini_shop.infrastructure.cartProduct.repository;

import com.github.dabin.mini_shop.infrastructure.cartProduct.entity.CartProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartProductJpaRepository extends JpaRepository<CartProductEntity, Long> {
}
