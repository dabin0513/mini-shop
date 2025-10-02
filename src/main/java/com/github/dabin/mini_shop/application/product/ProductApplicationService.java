package com.github.dabin.mini_shop.application.product;

import com.github.dabin.mini_shop.api.product.dto.request.CreateProductRequestDto;
import com.github.dabin.mini_shop.api.product.dto.response.CreateProductResponseDto;
import com.github.dabin.mini_shop.api.product.dto.response.GetProductResponseDto;
import com.github.dabin.mini_shop.api.product.mapper.ProductDtoMapper;
import com.github.dabin.mini_shop.domain.product.model.Product;
import com.github.dabin.mini_shop.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductApplicationService {
    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;

    public List<GetProductResponseDto> findAll() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(productDtoMapper::toGetResponseDto).toList();
    }

    @Transactional
    public CreateProductResponseDto save(CreateProductRequestDto createProductRequestDto) {
        Product product = productDtoMapper.toDomain(createProductRequestDto);
        Product savedProduct = productRepository.save(product);
        return productDtoMapper.toCreateResponseDto(savedProduct);
    }
}
