package be.vdab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import be.vdab.restclients.KoersenClient;

@Configuration
@ComponentScan
public class ServicesConfig {
	
	@Autowired
	@Qualifier("ECB")
	private KoersenClient koersenClient;
	
	@Bean
	EuroService euroService() {
		return new EuroService(koersenClient);
	}

}
