package com.github.dabin.mini_shop.infrastructure.cart.repository;

import com.github.dabin.mini_shop.infrastructure.cart.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartJpaRepository extends JpaRepository<CartEntity, Long> {
}
