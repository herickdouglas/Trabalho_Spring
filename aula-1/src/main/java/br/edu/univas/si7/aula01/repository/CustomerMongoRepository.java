package br.edu.univas.si7.aula01.repository;

import br.edu.univas.si7.aula01.model.Customer;
import br.edu.univas.si7.aula01.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerMongoRepository extends MongoRepository<Customer, String> {
}
