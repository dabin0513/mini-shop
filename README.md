# mini-shop 🛍️

> 동시성 제어와 분산 트랜잭션 문제 해결을 위한 쇼핑몰 토이 프로젝트  


## 📌 프로젝트 개요
mini-shop은 기본적인 쇼핑몰 도메인(상품 관리, 주문, 알림)을 바탕으로 **동시성 제어(재고 차감)** 와 **분산 트랜잭션(주문-알림 보장)** 문제를 다루기 위해 설계된 프로젝트입니다. 


## 🛠️ 기술 스택
- **Backend**: Java 21, Spring Boot 3.5.6, Spring Data JPA, Kafka
- **Frontend**: [React + TypeScript](https://github.com/dabin0513/mini-shop-front) (피그마 메이커가 자동 생성한 코드)
- **DB**: MySQL, Redis


## 🏗️ 시스템 아키텍처
mini-shop은 DDD 기반 Layered Architecture를 따릅니다.

```
src/main/java/com/github/dabin/mini_shop
 ├─ api
 │   └─ order
 │       ├─ OrderController.java              
 │       ├─ dto
 │       │   ├─ request
 │       │   │   └─ OrderRequestDto.java
 │       │   └─ response
 │       │       └─ OrderResponseDto.java
 │       └─ mapper
 │           └─ OrderDtoMapper.java           # Domain <-> DTO 변환
 │
 ├─ application
 │   └─ order
 │       └─ OrderApplicationService.java      # 유즈케이스, 트랜잭션 단위
 │
 ├─ domain
 │   └─ order
 │       ├─ model
 │       │   ├─ Order.java                    # 도메인
 │       │   ├─ OrderStatus.java              # 값 객체 / Enum
 │       └─ repository
 │           └─ OrderRepository.java          # 도메인 레벨 Repository 인터페이스
 │
 └─ infrastructure
     └─ order
         ├─ entity
         │   └─ OrderEntity.java              # 엔티티
         ├─ mapper
         │   └─ OrderEntityMapper.java        # Domain <-> Entity 변환
         └─ repository
             ├─ OrderJpaRepository.java       # Spring Data JPA 인터페이스
             └─ OrderRepositoryJpa.java       # 도메인 OrderRepository 구현체
```



## ✨ 주요 기능


## 📚 문서
- [Use Cases](docs/use-case.md)
- [ERD](https://www.erdcloud.com/d/WyFdqqTB8w4f9pQW6)
