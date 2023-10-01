package com.shravan.Ecommerce_API.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;

    //@ManyToOne
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
