package com.onlineshop.OnlineShop.Controller;

import com.onlineshop.OnlineShop.Repository.ItemRepository;
import com.onlineshop.OnlineShop.Repository.order.OrderRepository;
import com.onlineshop.OnlineShop.model.Item;
import com.onlineshop.OnlineShop.model.order.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final ItemRepository repo;
    private final OrderRepository Orepo;

    public AdminController(ItemRepository repo, OrderRepository orepo) {
        this.repo = repo;
        Orepo = orepo;
    }

    @GetMapping
    private String adminPage(){
        return "adminview/additem";
    }

    @PostMapping
    private String addItem(Item item){
        repo.save(item);
        return "redirect:/";
    }

    @GetMapping("/showorders")
    @ResponseBody
    public List<Order> showOrders(){
        return Orepo.findAll();
    }
}
