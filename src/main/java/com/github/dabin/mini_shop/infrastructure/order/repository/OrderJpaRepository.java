package com.github.dabin.mini_shop.infrastructure.order.repository;

import com.github.dabin.mini_shop.infrastructure.order.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, Long> {
}
