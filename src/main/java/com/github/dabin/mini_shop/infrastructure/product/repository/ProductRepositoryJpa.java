package com.github.dabin.mini_shop.infrastructure.product.repository;

import com.github.dabin.mini_shop.domain.product.model.Product;
import com.github.dabin.mini_shop.domain.product.repository.ProductRepository;
import com.github.dabin.mini_shop.infrastructure.product.entity.ProductEntity;
import com.github.dabin.mini_shop.infrastructure.product.mapper.ProductEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryJpa implements ProductRepository {
    private final ProductJpaRepository productJpaRepository;
    private final ProductEntityMapper productEntityMapper;

    @Override
    public List<Product> findAll() {
        List<ProductEntity> productEntities = productJpaRepository.findAll();
        return productEntities.stream().map(productEntityMapper::toDomain).toList();
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productEntityMapper.toEntity(product);
        return productEntityMapper.toDomain(productJpaRepository.save(productEntity));
    }
}
