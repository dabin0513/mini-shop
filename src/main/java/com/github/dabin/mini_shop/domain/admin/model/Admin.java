package com.github.dabin.mini_shop.domain.admin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Long id;
    private String loginId;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
