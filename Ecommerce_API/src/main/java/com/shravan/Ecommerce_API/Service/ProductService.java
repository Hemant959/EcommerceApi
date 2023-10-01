package com.shravan.Ecommerce_API.Service;

import com.shravan.Ecommerce_API.Irepo.IProductRepo;
import com.shravan.Ecommerce_API.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String addAllProduct(List<Product> add) {
        iProductRepo.saveAll(add);
        return "Added Product success";
    }

    public List<Product> getAllProduct() {
        return iProductRepo.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return iProductRepo.findAll();
    }


    public String DeleteProuct(Long id) {
         iProductRepo.deleteById(id);
        return "Delete Success";
    }
}
