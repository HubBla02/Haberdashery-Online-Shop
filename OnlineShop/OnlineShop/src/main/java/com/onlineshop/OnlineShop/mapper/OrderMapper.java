package com.onlineshop.OnlineShop.mapper;

import com.onlineshop.OnlineShop.Cart;
import com.onlineshop.OnlineShop.CartItem;
import com.onlineshop.OnlineShop.dto.OrderDto;
import com.onlineshop.OnlineShop.model.order.Order;
import com.onlineshop.OnlineShop.model.order.OrderItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {
    public static Order mapToOrder(OrderDto orderDto){
         return Order.builder()
                 .firstName(orderDto.getFirstName())
                 .lastName(orderDto.getLastName())
                 .address(orderDto.getAddress())
                 .postCode(orderDto.getPostCode())
                 .city(orderDto.getCity())
                 .created(LocalDateTime.now())
                 .build();
    }

    public static List<OrderItem> mapToOrderItem(Cart cart, Order order){
        List<OrderItem> orderItems = new ArrayList<>();
        for(CartItem c : cart.getCartItems()){
            orderItems.add(new OrderItem(order.getOrderId(), c.getItem().getId(), cart.getCounter()));
        }
        return orderItems;
    }
}
