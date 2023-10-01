package com.shravan.Ecommerce_API.Controller;

import com.shravan.Ecommerce_API.Model.User;
import com.shravan.Ecommerce_API.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("posts")
    private String addAllUser(@RequestBody List<User> add){
        return userService.addAllUser(add);
    }
    @GetMapping("gets/user")
    public Optional<User> getAllUser(@RequestParam Long id){
        return userService.getAllUser(id);
    }
}
