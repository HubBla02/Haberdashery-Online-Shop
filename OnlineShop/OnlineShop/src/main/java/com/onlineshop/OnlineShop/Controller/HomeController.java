package com.onlineshop.OnlineShop.Controller;

import com.onlineshop.OnlineShop.Cart;
import com.onlineshop.OnlineShop.Repository.ItemRepository;
import com.onlineshop.OnlineShop.Service.CartService;
import com.onlineshop.OnlineShop.model.Item;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    private CartService service;

    public HomeController(CartService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("items", service.getAllItems());
        return "home";
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }

    @GetMapping("/add/{id}")
    public String addItemToCart(@PathVariable("id") Integer id, Model model){
        service.increaseItemCart(id);
        model.addAttribute("items", service.getAllItems());
        return "home";
    }

    @GetMapping("/remove/{id}")
    public String removeItemsFromCart(@PathVariable("id") Integer id){
        return "cartview";
    }
}
