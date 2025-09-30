package com.github.dabin.mini_shop.infrastructure.category.repository;

import com.github.dabin.mini_shop.infrastructure.category.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity, Long> {
}
