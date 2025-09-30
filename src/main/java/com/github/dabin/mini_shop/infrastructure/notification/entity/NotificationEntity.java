package com.github.dabin.mini_shop.infrastructure.notification.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notification")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("고객 아이디")
    @Column(name = "customer_id")
    private Long customerId;

    @Comment("제목")
    @Column(name = "title")
    private String title;

    @Comment("알림 내용")
    @Column(name = "content")
    private String content;

    @Comment("알림 상태")
    @Column(name = "notification_status")
    private String notificationStatus;

    @Comment("알림 유형")
    @Column(name = "type")
    private String type;

    @Comment("읽음 여부")
    @Column(name = "is_read")
    private boolean isRead;

    @Comment("등록일")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정일")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
