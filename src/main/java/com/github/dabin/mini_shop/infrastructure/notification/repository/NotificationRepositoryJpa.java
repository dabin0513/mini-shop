package com.github.dabin.mini_shop.infrastructure.notification.repository;

import com.github.dabin.mini_shop.domain.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NotificationRepositoryJpa implements NotificationRepository {
    private final NotificationJpaRepository notificationJpaRepository;
}
