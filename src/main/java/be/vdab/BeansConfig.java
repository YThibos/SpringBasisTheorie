package be.vdab;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import be.vdab.restclients.KoersenClient;
import be.vdab.services.EuroService;

//@Configuration
//@PropertySource("classpath:restclients.properties")
public class BeansConfig {

//	// VALUES
//	@Value("${ecbKoersenURL}")
//	private URL ecbURL;
//	
//	@Value("${yahooKoersenURL}")
//	private URL yahooURL;
//	
//	
//	// BEANS
//	@Bean
//	KoersenClient koersenClient() {
//		try (InputStream stream = yahooURL.openStream()) {
//			return new YahooKoersenClient(yahooURL);
//		}
//		catch (IOException ex) {
//			return new ECBKoersenClient(ecbURL);
//		}
//	}
//	
//	@Bean
//	EuroService euroService() {
//		return new EuroService(koersenClient());
//	}
//	
//	@Bean
//	ClassA classA() {
//		return new ClassA();
//	}
//
//	@Bean
//	ClassB classB() {
//		return new ClassB("03/123.45.67", 1);
//	}
//	
}
