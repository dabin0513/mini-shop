package com.github.dabin.mini_shop.infrastructure.customer.repository;

import com.github.dabin.mini_shop.infrastructure.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, Long> {
}
