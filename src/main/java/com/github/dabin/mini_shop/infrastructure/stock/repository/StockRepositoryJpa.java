package com.github.dabin.mini_shop.infrastructure.stock.repository;

import com.github.dabin.mini_shop.domain.stock.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StockRepositoryJpa implements StockRepository {
    private final StockJpaRepository stockJpaRepository;
}
