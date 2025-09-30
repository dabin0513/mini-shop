package com.github.dabin.mini_shop.infrastructure.orderProduct.repository;

import com.github.dabin.mini_shop.domain.orderProduct.repository.OrderProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderProductRepositoryJpa implements OrderProductRepository {
    private final OrderProductJpaRepository orderProductJpaRepository;
}
