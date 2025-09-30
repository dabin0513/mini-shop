package com.github.dabin.mini_shop.infrastructure.repository;

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
@Table(name = "order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("고객 아이디")
    @Column(name = "customer_id")
    private Long customerId;

    @Comment("주문 상태")
    @Column(name = "order_status")
    private String orderStatus;

    @Comment("주문 수량")
    @Column(name = "total_amount")
    private int totalAmount;

    @Comment("등록일")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정일")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
