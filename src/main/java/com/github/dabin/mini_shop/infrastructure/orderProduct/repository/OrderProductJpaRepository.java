package com.github.dabin.mini_shop.infrastructure.orderProduct.repository;

import com.github.dabin.mini_shop.infrastructure.orderProduct.entity.OrderProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductJpaRepository extends JpaRepository<OrderProductEntity, Long> {
}
