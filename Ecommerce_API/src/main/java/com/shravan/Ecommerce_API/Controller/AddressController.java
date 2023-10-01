package com.shravan.Ecommerce_API.Controller;

import com.shravan.Ecommerce_API.Model.Address;
import com.shravan.Ecommerce_API.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("post")
    public String addAllAddress(@RequestBody List<Address> add){
        return addressService.addAllAddress(add);
    }
}
