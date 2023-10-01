package com.shravan.Ecommerce_API.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_table")
public class Order {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer orderId;

    @OneToOne
    @JoinColumn(name = "fk_UserId")
    User userId;

    @OneToOne
    @JoinColumn(name = "fk_Product_Id")
    Product productId;

    @OneToOne
    @JoinColumn(name = "fk_Address_Id")
    Address addressId;

    private Integer productQuantity;
}
