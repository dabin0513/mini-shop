package com.github.dabin.mini_shop.api.product;

import com.github.dabin.mini_shop.api.common.response.ApiResponse;
import com.github.dabin.mini_shop.api.product.dto.request.CreateProductRequestDto;
import com.github.dabin.mini_shop.api.product.dto.response.CreateProductResponseDto;
import com.github.dabin.mini_shop.api.product.dto.response.GetProductResponseDto;
import com.github.dabin.mini_shop.application.product.ProductApplicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
@Tag(name = "상품 API", description = "상품 관련 기능 제공")
public class ProductController {
    private final ProductApplicationService productApplicationService;

    @GetMapping("/v1/all")
    @Operation(summary = "상품 목록 조회", description = "상품의 전체 리스트를 조회합니다.")
    public ResponseEntity<ApiResponse<List<GetProductResponseDto>>> getAll() {
        return ResponseEntity.ok(ApiResponse.success(productApplicationService.findAll()));
    }

    @PostMapping("/v1/create")
    @Operation(summary = "상품 단건 등록", description = "상품 정보를 등록합니다.")
    public ResponseEntity<ApiResponse<CreateProductResponseDto>> create(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ResponseEntity.ok(ApiResponse.success(productApplicationService.save(createProductRequestDto)));
    }
}
