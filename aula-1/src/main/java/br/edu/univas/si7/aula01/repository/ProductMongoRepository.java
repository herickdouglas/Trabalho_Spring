package br.edu.univas.si7.aula01.repository;

import br.edu.univas.si7.aula01.model.Order;
import br.edu.univas.si7.aula01.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductMongoRepository extends MongoRepository<Product, String> {
}
