package com.github.dabin.mini_shop.infrastructure.stock.entity;

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
@Table(name = "stock")
public class StockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("현재 재고 수량")
    @Column(name = "stock_quantity")
    private int stockQuantity;

    @Comment("재고 경고 기준")
    @Column(name = "stock_threshold")
    private int stockThreshold;

    @Comment("등록일")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정일")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
