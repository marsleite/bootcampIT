package com.example.demo.entities;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity
@Table(name = "customers")
public class Customer extends Object {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name= "firstname")
  private String firstName;
  @Column(name= "lastname")
  private String lastName;
  @Column(name= "password")
  private String password;

}
