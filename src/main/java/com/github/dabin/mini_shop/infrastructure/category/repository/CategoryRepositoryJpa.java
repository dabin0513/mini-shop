package com.github.dabin.mini_shop.infrastructure.category.repository;

import com.github.dabin.mini_shop.domain.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CategoryRepositoryJpa implements CategoryRepository {
    private final CategoryJpaRepository categoryJpaRepository;
}
