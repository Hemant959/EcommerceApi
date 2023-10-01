package com.shravan.Ecommerce_API.Controller;

import com.shravan.Ecommerce_API.Model.Order;
import com.shravan.Ecommerce_API.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
   @GetMapping("get")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }
    @PostMapping("post/order")
    public String addOrder(@RequestBody List<Order>order){
       return orderService.addOrder(order);
    }
}
