package it.gacciai.edu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("it.gacciai.edu.springboot.repository")
@EntityScan("it.gacciai.edu.springboot.model")
@SpringBootApplication
public class JavaSpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootTutorialApplication.class, args);
	}

}
