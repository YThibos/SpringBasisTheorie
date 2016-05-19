package be.vdab;

import java.math.BigDecimal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.services.EuroService;

public class Main {

	public static void main(String[] args) {
		 try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
			 
			 System.out.println("---CLASS A---");
			 ClassA objectA = context.getBean(ClassA.class);
			 System.out.println(objectA.getKoersenURL());
			 System.out.println(objectA.getDefaultTaalEnLand().getDisplayName());
			 System.out.println("Bestand bestaat: " + objectA.getImportData().exists());
			 System.out.println(objectA.getDefaultBladRichting());
			 System.out.println(objectA.getWebMasterEmailAdres());
			 System.out.println(objectA.getWebsiteGestart());
			 
			 System.out.println("\n---CLASS B---");
			 ClassB objectB = context.getBean(ClassB.class);
			 System.out.println(objectB.getTelefoonNrHelpDesk());
			 System.out.println(objectB.getAantalPogingenUpdateKlant());
			 
			 System.out.println("\n---OTHER STUFF---");
			 System.out.println(context.getBean(HelpdeskMedewerkers.class));
			 System.out.println(context.getBean(EuroService.class).naarDollar(BigDecimal.valueOf(10)));
			
		}
	}
	
}
