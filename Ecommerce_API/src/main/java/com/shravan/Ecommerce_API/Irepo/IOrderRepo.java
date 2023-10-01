package com.shravan.Ecommerce_API.Irepo;

import com.shravan.Ecommerce_API.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Long> {

}
