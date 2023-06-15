package com.onlineshop.OnlineShop.Service;

import com.onlineshop.OnlineShop.Cart;
import com.onlineshop.OnlineShop.Repository.order.OrderItemRepository;
import com.onlineshop.OnlineShop.Repository.order.OrderRepository;
import com.onlineshop.OnlineShop.dto.OrderDto;
import com.onlineshop.OnlineShop.mapper.OrderMapper;
import com.onlineshop.OnlineShop.model.order.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final Cart cart;
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    public OrderService(Cart cart, OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.cart = cart;
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    public void saveOrder(OrderDto orderDto){
        Order order = OrderMapper.mapToOrder(orderDto);
        orderRepository.save(order);
        orderItemRepository.saveAll(OrderMapper.mapToOrderItem(cart, order));
        cart.clearCart();
    }
}
