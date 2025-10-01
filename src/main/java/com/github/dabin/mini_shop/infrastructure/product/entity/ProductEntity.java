package com.github.dabin.mini_shop.infrastructure.product.entity;

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
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("카테고리 아이디")
    @Column(name = "category_id")
    private Long categoryId;

    @Comment("재고 아이디")
    @Column(name = "stock_id")
    private Long stockId;

    @Comment("상품명")
    @Column(name = "name")
    private String name;

    @Comment("판매 가격")
    @Column(name = "sale_price")
    private Long salePrice;

    @Comment("정가")
    @Column(name = "list_price")
    private Long listPrice;

    @Comment("이미지 경로")
    @Column(name = "image_url")
    private String imageUrl;

    @Comment("상품 상태")
    @Column(name = "product_status")
    private String productStatus;

    @Comment("판매량")
    @Column(name = "sales_count")
    private int salesCount;

    @Comment("등록일")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Comment("수정일")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    public static ProductEntity of(
            Long id, Long categoryId, Long stockId, String name,
            Long salePrice, Long listPrice, String imageUrl, String productStatus,
            int salesCount, LocalDateTime createdAt, LocalDateTime updatedAt
    ) {
        return new ProductEntity(
                id, categoryId, stockId, name, salePrice, listPrice,
                imageUrl, productStatus, salesCount, createdAt, updatedAt
        );
    }
}
