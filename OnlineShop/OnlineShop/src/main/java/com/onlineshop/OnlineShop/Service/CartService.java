package com.onlineshop.OnlineShop.Service;

import com.onlineshop.OnlineShop.Cart;
import com.onlineshop.OnlineShop.CartItem;
import com.onlineshop.OnlineShop.Repository.ItemRepository;
import com.onlineshop.OnlineShop.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final ItemRepository repo;
    private final Cart cart;

    public CartService(ItemRepository repo, Cart cart) {
        this.repo = repo;
        this.cart = cart;
    }

    public List<Item> getAllItems(){
        return repo.findAll();
    }

    public void increaseItemCart(Integer id){
        Optional<Item> oItem = repo.findById(id);
        if(oItem.isPresent()){
            Item item = oItem.get();
            cart.addItem(item);
        }
    }

    public void decereaseItemCart(Integer id){
        Optional<Item> oItem = repo.findById(id);
        if(oItem.isPresent()){
            Item item = oItem.get();
            cart.deacreaseItem(item);
        }
    }

    public void removeItem(int id){
        Optional<Item> oItem = repo.findById(id);
        if (oItem.isPresent()){
            Item item = oItem.get();
            cart.removeAllItems(item);
            }
        }
    }

