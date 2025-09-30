package com.github.dabin.mini_shop.domain.notification.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    private Long id;
    private Long customerId;
    private String title;
    private String content;
    private String notificationStatus;
    private String type;
    private boolean isRead;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
