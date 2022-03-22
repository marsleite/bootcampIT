package com.example.demo.entities;

import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToMany()
  @JoinColumn(name = "fk_costumer")
  private Custumer custumer;
  @Column(name = "country")
  private String country;
  @Column(name = "address")
  private String address;
}
