package com.github.dabin.mini_shop.domain.order.repository;

import com.github.dabin.mini_shop.infrastructure.repository.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<OrderEntity, Long> {
}
