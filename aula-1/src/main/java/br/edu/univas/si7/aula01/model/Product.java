package br.edu.univas.si7.aula01.model;

import lombok.Data;

@Data
public class Product {
    private int code;
    private String name;
    private double unitValue;
    private int amount;
}
