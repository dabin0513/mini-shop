package com.github.dabin.mini_shop.infrastructure.admin.repository;

import com.github.dabin.mini_shop.domain.admin.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AdminRepositoryJpa implements AdminRepository {
    private final AdminJapRepository adminJapRepository;
}
