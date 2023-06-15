package com.onlineshop.OnlineShop.Repository.order;

import com.onlineshop.OnlineShop.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface OrderRepository extends JpaRepository<Order, Integer> {
}
