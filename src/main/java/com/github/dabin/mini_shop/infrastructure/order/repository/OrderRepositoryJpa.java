package com.github.dabin.mini_shop.infrastructure.order.repository;

import com.github.dabin.mini_shop.domain.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryJpa implements OrderRepository {
    private final OrderJpaRepository orderJpaRepository;
}
