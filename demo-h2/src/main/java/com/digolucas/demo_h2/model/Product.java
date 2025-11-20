package com.digolucas.demo_h2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameProduct;


    private String producer;


    private double price;


    private int stock;

    //Gerar dependencia size
    @NotBlank(message = "Descrição Obrigatória")
    @Size(min = 10, message = "Descrição tem que ter no minímo 10")
    private String description;
}
