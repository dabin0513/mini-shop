package com.github.dabin.mini_shop.infrastructure.admin.repository;

import com.github.dabin.mini_shop.infrastructure.admin.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJapRepository extends JpaRepository<AdminEntity, Long> {
}
