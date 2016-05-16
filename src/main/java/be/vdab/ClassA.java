package be.vdab;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.util.Locale;

public class ClassA implements InterfaceA {

	// MEMBER VARIABLES
	private String telefoonNrHelpdesk;
	private URL koersenURL;
	private Locale defaultTaalEnLand;
	private File importData;
	private BladRichtingInPrinter defaultBladRichting;
	private EmailAdres webMasterEmailAdres;
	private LocalDate websiteGestart;
	
	
	// GETTERS
	public String getTelefoonNrHelpdesk() {
		return telefoonNrHelpdesk;
	}
	public URL getKoersenURL() {
		return koersenURL;
	}
	public Locale getDefaultTaalEnLand() {
		return defaultTaalEnLand;
	}
	public File getImportData() {
		return importData;
	}
	public BladRichtingInPrinter getDefaultBladRichting() {
		return defaultBladRichting;
	}
	public EmailAdres getWebMasterEmailAdres() {
		return webMasterEmailAdres;
	}
	public LocalDate getWebsiteGestart() {
		return websiteGestart;
	}

	
	// SETTERS
	public void setTelefoonNrHelpdesk(String telefoonNrHelpdesk) {
		this.telefoonNrHelpdesk = telefoonNrHelpdesk;
	}
	public void setKoersenURL(URL koersenURL) {
		this.koersenURL = koersenURL;
	}
	public void setDefaultTaalEnLand(Locale defaultTaalEnLand) {
		this.defaultTaalEnLand = defaultTaalEnLand;
	}
	public void setImportData(File importData) {
		this.importData = importData;
	}
	public void setDefaultBladRichting(BladRichtingInPrinter defaultBladRichting) {
		this.defaultBladRichting = defaultBladRichting;
	}
	public void setWebMasterEmailAdres(EmailAdres webMasterEmailAdres) {
		this.webMasterEmailAdres = webMasterEmailAdres;
	}
	public void setWebsiteGestart(LocalDate websiteGestart) {
		this.websiteGestart = websiteGestart;
	}

	
	// OVERRIDE STUFF
	@Override
	public String getBoodschap() {
		return "ClassA object";
	}
	
	

}
