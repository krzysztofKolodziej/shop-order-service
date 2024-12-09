package com.shop.shop_order_service.order.service;

import com.shop.shop_order_service.order.dto.OrderDto;
import com.shop.shop_order_service.order.model.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDto toDto(Order order);
}
