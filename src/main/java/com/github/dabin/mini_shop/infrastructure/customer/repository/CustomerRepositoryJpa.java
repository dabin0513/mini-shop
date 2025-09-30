package com.github.dabin.mini_shop.infrastructure.customer.repository;

import com.github.dabin.mini_shop.domain.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CustomerRepositoryJpa implements CustomerRepository {
    private final CustomerJpaRepository jpaRepository;
}
