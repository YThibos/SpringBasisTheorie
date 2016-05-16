package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
			 
			 ClassA objectA = context.getBean(ClassA.class);
			 System.out.println(objectA.getKoersenURL());
			 System.out.println(objectA.getDefaultTaalEnLand().getDisplayName());
			 System.out.println("Bestand bestaat: " + objectA.getImportData().exists());
			 System.out.println(objectA.getDefaultBladRichting());
			 System.out.println(objectA.getWebMasterEmailAdres());
			 System.out.println(objectA.getWebsiteGestart());
			 
			 ClassB objectB = context.getBean(ClassB.class);
			 System.out.println(objectB.getTelefoonNrHelpDesk());
			 System.out.println(objectB.getAantalPogingenUpdateKlant());
			 
			 System.out.println(context.getBean(HelpdeskMedewerkers.class));
			
		}
	}
	
}