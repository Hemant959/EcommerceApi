package com.shravan.Ecommerce_API.Irepo;

import com.shravan.Ecommerce_API.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddresRepo extends JpaRepository<Address,Long> {
}
