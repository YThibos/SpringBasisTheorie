package be.vdab.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.restclients.DummyKoersenClient;
import be.vdab.restclients.KoersenClient;

public class EuroServiceTest {

	private KoersenClient koersenClient;
	private EuroService euroService;
	
	@Before
	public void before() {
		koersenClient = new DummyKoersenClient();
		euroService = new EuroService(koersenClient);
	}
	
	@Test
	public void test() {
		assertEquals(0, euroService.naarDollar(BigDecimal.valueOf(2)).compareTo( // 2 * 1.5 = 
				BigDecimal.valueOf(3)));	 									/// 3
	}

}
	