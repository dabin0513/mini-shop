package com.github.dabin.mini_shop.api.product;

import com.github.dabin.mini_shop.api.product.dto.response.ProductGetResponseDto;
import com.github.dabin.mini_shop.application.product.ProductApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductApplicationService productApplicationService;

    @GetMapping("/all")
    public List<ProductGetResponseDto> getAll() {
        return productApplicationService.findAll();
    }
}
