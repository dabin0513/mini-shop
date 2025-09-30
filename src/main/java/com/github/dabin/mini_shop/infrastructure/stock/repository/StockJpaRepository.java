package com.github.dabin.mini_shop.infrastructure.stock.repository;

import com.github.dabin.mini_shop.infrastructure.stock.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockJpaRepository extends JpaRepository<StockEntity, Long> {
}
