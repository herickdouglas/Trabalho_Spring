package br.edu.univas.si7.aula01.repository;

import br.edu.univas.si7.aula01.model.Order;
import br.edu.univas.si7.aula01.model.Ship;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShipMongoRepository extends MongoRepository<Ship, String> {
}
