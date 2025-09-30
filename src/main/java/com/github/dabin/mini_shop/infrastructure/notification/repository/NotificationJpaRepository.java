package com.github.dabin.mini_shop.infrastructure.notification.repository;

import com.github.dabin.mini_shop.infrastructure.notification.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationJpaRepository extends JpaRepository<NotificationEntity, Long> {
}
