package com.onlineshop.OnlineShop;

import com.onlineshop.OnlineShop.model.Item;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class CartItem {
    private Item item;
    private int counter;
    private BigDecimal price;

    public CartItem(Item item){
        this.item = item;
        this.counter = 1;
        this.price = item.getPrice();
    }

    public void increaseCounter(){
        counter++;
        recalculate();
    }

    public void decreaseeCounter(){
        if (counter > 0 ) {
            counter--;
            recalculate();
        }
    }

    private void recalculate(){
        price = item.getPrice().multiply(new BigDecimal(counter));
    }

    public boolean isEmpty(){
        return counter == 0;
    }

    public boolean idEquals(Item item){
        return this.item.getId().equals(item.getId());
    }
}
