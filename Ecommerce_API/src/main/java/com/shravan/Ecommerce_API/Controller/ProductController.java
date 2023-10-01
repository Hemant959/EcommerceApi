package com.shravan.Ecommerce_API.Controller;

import com.shravan.Ecommerce_API.Model.Product;
import com.shravan.Ecommerce_API.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("post/Product")
    public String addAllProduct(@RequestBody List<Product> add){
        return productService.addAllProduct(add);
    }
    @GetMapping("gets")
    public List<Product>getAllProduct(){
        return productService.getAllProduct();
    }
    @GetMapping("product")
    public List<Product> getProductsByCategory(@RequestParam("category") String category) {
        return productService.getProductsByCategory(category);
    }
    @DeleteMapping("Delete")
    public String DeleteProduct(@RequestParam Long id){
        return productService.DeleteProuct(id);
    }
}
