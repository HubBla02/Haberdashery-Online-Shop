package com.onlineshop.OnlineShop.Repository;

import com.onlineshop.OnlineShop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
