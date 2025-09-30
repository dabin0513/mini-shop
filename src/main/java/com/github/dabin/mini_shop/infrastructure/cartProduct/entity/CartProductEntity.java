package com.github.dabin.mini_shop.infrastructure.cartProduct.entity;

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
@Table(name = "cart_product")
public class CartProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("장바구니 아이디")
    @Column(name = "cart_id")
    private Long cartId;

    @Comment("상품 아이디")
    @Column(name = "product_id")
    private Long productId;

    @Comment("수량")
    @Column(name = "quantity")
    private int quantity;

    @Comment("등록일")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정일")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
