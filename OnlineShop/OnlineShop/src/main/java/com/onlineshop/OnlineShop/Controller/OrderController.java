package com.onlineshop.OnlineShop.Controller;

import com.onlineshop.OnlineShop.Service.CartService;
import com.onlineshop.OnlineShop.Service.OrderService;
import com.onlineshop.OnlineShop.dto.OrderDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    private CartService service;
    private final OrderService oService;

    public OrderController(CartService service, OrderService oService) {
        this.service = service;
        this.oService = oService;
    }

    @RequestMapping("/cart")
    public String showCart(){
        return "cartview";
    }

    @GetMapping("/increase/{id}")
    public String increaseItem(@PathVariable("id") Integer id, Model model){
        service.increaseItemCart(id);
        return "cartview";
    }

    @GetMapping("/decrease/{id}")
    public String decreaseItem(@PathVariable("id") Integer id, Model model){
        service.decereaseItemCart(id);
        return "cartview";
    }

    @GetMapping("/remove/{id}")
    public String removeItem(@PathVariable("id") Integer id, Model model){
        service.removeItem(id);
        return "cartview";
    }

    @GetMapping("/summary")
    public String showSummary(){
        return "summary";
    }

    @PostMapping("/saveorder")
    public String saveOrder(OrderDto orderDto){
        oService.saveOrder(orderDto);
        return "redirect:/";
    }
}
