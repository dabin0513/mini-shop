package com.github.dabin.mini_shop.api.product;

import com.github.dabin.mini_shop.api.product.dto.response.ProductGetResponseDto;
import com.github.dabin.mini_shop.application.product.ProductApplicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
@Tag(name = "상품 API", description = "상품 관련 기능 제공")
public class ProductController {
    private final ProductApplicationService productApplicationService;

    @GetMapping("/all")
    @Operation(summary = "상품 목록 조회", description = "상품의 전체 리스트를 조회합니다.")
    public List<GetProductResponseDto> getAll() {
        return productApplicationService.findAll();
    }
}
