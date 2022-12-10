package br.edu.univas.si7.aula01;

import br.edu.univas.si7.aula01.model.User;
import br.edu.univas.si7.aula01.model.support.MessagePriority;
import br.edu.univas.si7.aula01.repository.CustomerMongoRepository;
import br.edu.univas.si7.aula01.repository.OrderMongoRepository;
import br.edu.univas.si7.aula01.repository.ProductMongoRepository;
import br.edu.univas.si7.aula01.repository.ShipMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Aula01Application implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(Aula01Application.class, args);
	}

//	@Autowired
//	private MessageRepository msgRepo;
	
	@Autowired
	private OrderMongoRepository OrderRepo;
	
	@Autowired
	private CustomerMongoRepository CustomerRepo;

	@Autowired
	private ProductMongoRepository productRepo;

	@Autowired
	private ShipMongoRepository ShipRepo;

	@Override
	public void run(String... args) throws Exception {


	}
}
