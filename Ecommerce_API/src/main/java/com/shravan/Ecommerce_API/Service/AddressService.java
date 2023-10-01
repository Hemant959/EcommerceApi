package com.shravan.Ecommerce_API.Service;

import com.shravan.Ecommerce_API.Irepo.IAddresRepo;
import com.shravan.Ecommerce_API.Model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddresRepo iAddresRepo;

    public String addAllAddress(List<Address> add) {
        iAddresRepo.saveAll(add);
        return "Added Address Success";
    }
}
