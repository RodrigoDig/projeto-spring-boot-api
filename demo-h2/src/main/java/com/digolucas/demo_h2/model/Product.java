package com.digolucas.demo_h2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameProduct;


    private String producer;


    private double price;


    private int stock;

    //Gerar dependencia size
    private String description;

    public Product() {

    }

    public Product(Long id, String nameProduct, String producer, double price, int stock, String description) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
}
