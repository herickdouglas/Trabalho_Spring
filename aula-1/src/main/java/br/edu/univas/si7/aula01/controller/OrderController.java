package br.edu.univas.si7.aula01.controller;

import br.edu.univas.si7.aula01.model.Order;
import br.edu.univas.si7.aula01.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder(@RequestBody @Valid Order order) {
        service.createOrder(order);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Order findByNumber(@PathVariable String id) {
        return service.getOrderById(id);
    }

    @GetMapping("/{costumerId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Order> findByCustomer(@PathVariable String costumer) {
        return service.getCustommer(costumer);
    }
}
