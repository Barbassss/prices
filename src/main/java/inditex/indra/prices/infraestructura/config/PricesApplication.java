package inditex.indra.prices.infraestructura.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"inditex.indra.prices.infraestructura"})
@EntityScan(basePackages = {"inditex.indra.prices.dominio"})
@ComponentScan(basePackages = {"inditex.indra.prices.infraestructura"})
public class PricesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricesApplication.class, args);
	}

}
