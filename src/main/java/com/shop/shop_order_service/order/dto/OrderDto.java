package com.shop.shop_order_service.order.dto;

import com.shop.shop_order_service.order.model.OrderItem;
import com.shop.shop_order_service.order.model.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrderDto(
   Long id,
   Long userId,
   LocalDateTime orderDate,
   OrderStatus status,
   BigDecimal totalAmount,
   List<OrderItem> products
) {
}
