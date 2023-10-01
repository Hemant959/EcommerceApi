package com.shravan.Ecommerce_API.Service;

import com.shravan.Ecommerce_API.Irepo.IOrderRepo;
import com.shravan.Ecommerce_API.Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;


    public List<Order> getAllOrder() {
        return iOrderRepo.findAll();
    }

    public String addOrder(List<Order>order) {
        iOrderRepo.saveAll(order);
        return "Added Order";
    }
}
