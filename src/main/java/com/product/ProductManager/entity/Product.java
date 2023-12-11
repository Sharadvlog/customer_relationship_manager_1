package com.product.ProductManager.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Product_Tab")
public class Product {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private String name;
private double price;
private String description;


}