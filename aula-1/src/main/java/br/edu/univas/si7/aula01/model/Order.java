package br.edu.univas.si7.aula01.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "Orders")
public class Order {

    @org.springframework.data.annotation.Id
    private int orderNumber;
    private LocalDate lastUpdate;
    private float totalPrice;
    private String status;
    private String paymentStatus;
    @DBRef(lazy = true)
    private Ship ship;
    @DBRef(lazy = true)
    private Customer customer;
    @DBRef(lazy = true)
    private List<Product> products;
}
