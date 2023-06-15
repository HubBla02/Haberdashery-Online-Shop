package com.onlineshop.OnlineShop.Repository.order;

import com.onlineshop.OnlineShop.model.order.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
