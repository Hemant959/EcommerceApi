package com.shravan.Ecommerce_API.Irepo;

import com.shravan.Ecommerce_API.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<Product,Long> {
}
