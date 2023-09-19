package inditex.indra.prices.infraestructura.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import inditex.indra.prices.aplicacion.repository.TarifaRepository;
import inditex.indra.prices.aplicacion.service.TarifaService;

@Configuration
public class PricesApplicationConfig {
	@Bean
	public TarifaService userService(TarifaRepository userRepository) {
		return new TarifaService(userRepository);
	}
}
