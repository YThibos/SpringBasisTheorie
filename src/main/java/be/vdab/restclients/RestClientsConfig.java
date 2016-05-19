package be.vdab.restclients;

import java.net.URL;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:restclients.properties")
public class RestClientsConfig {

	@Value("${yahooKoersenURL}")
	private URL yahooURL;
	
	@Value("${ecbKoersenURL}")
	private URL ecbURL;
	
	@Bean
	@Qualifier("ECB")
	KoersenClient ecbKoersenClient() {
		return new ECBKoersenClient(ecbURL);
	}
	
	@Bean
	@Qualifier("Yahoo")
	KoersenClient yahooKoersenClient() {
		return new YahooKoersenClient(yahooURL);
	}
	
}
