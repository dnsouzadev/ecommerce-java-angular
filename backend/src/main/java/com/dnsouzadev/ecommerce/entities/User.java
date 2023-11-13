package com.dnsouzadev.ecommerce.entities;

import com.dnsouzadev.ecommerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;
    
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;
    
}
