package com.github.dabin.mini_shop.infrastructure.orderProduct.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_product")
public class OrderProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("주문 아이디")
    @Column(name = "order_id")
    private Long orderId;

    @Comment("상품 아이디")
    @Column(name = "product_id")
    private Long productId;

    @Comment("주문 수량")
    @Column(name = "quantity")
    private int quantity;

    @Comment("주문 가격")
    @Column(name = "slae_price")
    private int salePrice;

    @Comment("주문 당시 정가")
    @Column(name = "list_price")
    private int listPrice;
}
