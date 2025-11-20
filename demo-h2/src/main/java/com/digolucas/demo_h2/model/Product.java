package com.digolucas.demo_h2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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

    @NotBlank (message = "Nome do produto é obrigatório")
    private String nameProduct;

    @NotBlank (message = "Fabricante não pode ser nulo")
    private String producer;

    @Positive (message = "Preço não pode ser menor que 0")
    private double price;

    @Positive (message = "Estoque não pode ser menor que 0")
    private int stock;

    @NotBlank(message = "Descrição Obrigatória")
    @Size(min = 10, message = "Descrição tem que ter no minímo 10")
    private String description;
}
