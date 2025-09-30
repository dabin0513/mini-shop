package com.github.dabin.mini_shop.infrastructure.productSales.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_sales")
public class ProductSalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("상품 아이디")
    @Column(name = "product_id")
    private Long productId;

    @Comment("누적 판매량")
    @Column(name = "sales_count")
    private int salesCount;
}
