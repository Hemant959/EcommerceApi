package com.shravan.Ecommerce_API.Irepo;

import com.shravan.Ecommerce_API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {
}
