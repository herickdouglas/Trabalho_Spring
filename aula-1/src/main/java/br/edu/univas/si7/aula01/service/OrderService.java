package br.edu.univas.si7.aula01.service;


import br.edu.univas.si7.aula01.controller.exception.InvalidDataException;
import br.edu.univas.si7.aula01.controller.exception.ObjectNotFoundException;
import br.edu.univas.si7.aula01.model.Order;
import br.edu.univas.si7.aula01.repository.OrderMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    @Autowired
    private OrderMongoRepository orderRepo;

    public void createOrder(Order order) {
        orderRepo.save(order);
    }

    public Order getOrderById(@PathVariable String id) {
        if(id == null) {
            throw new InvalidDataException("id não pode ser null.");
        }
        Optional<Order> obj = orderRepo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Order não encontrada: " + id));
    }

    public List<Order> getCustommer(@PathVariable String name) {
        List<Order> listOrder = orderRepo.findAll();

        List<Order> listReturn = new ArrayList<Order>();


        for (Order order : listOrder) {
            if(order.getCustomer().getName().equals(name)){
                listReturn.add(order);
            }
		}

        if(!listReturn.isEmpty()){
            return listReturn;
        }else{
            return null;
        }
    }



}
