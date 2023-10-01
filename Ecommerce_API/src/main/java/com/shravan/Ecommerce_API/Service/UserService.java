package com.shravan.Ecommerce_API.Service;

import com.shravan.Ecommerce_API.Irepo.IUserRepo;
import com.shravan.Ecommerce_API.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String addAllUser(List<User> add) {
        iUserRepo.saveAll(add);
        return "Added User Success";
    }

    public Optional<User> getAllUser(Long id) {
       return iUserRepo.findById(id);



    }
}
