package luokat;

public class Kayttaja {
	
	private String etunimi;
	private String sukunimi;
	private String osoite;
	private String postinro;
	private String postitmp;
	private String sahkoposti;
	private String kayttajatunnus;
	private String salasana;
	private boolean admin;
	
	public Kayttaja(String etunimi, String sukunimi, String sahkoposti, String kayttajatunnus, String salasana) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.sahkoposti = sahkoposti;
		this.kayttajatunnus = kayttajatunnus;
		this.salasana = salasana;
		this.admin = false;
	}
	
	public Kayttaja(String etunimi, String sukunimi, String osoite, String postinro, String sahkoposti, String kayttajatunnus, String postitmp) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.sahkoposti = sahkoposti;
		this.kayttajatunnus = kayttajatunnus;
		this.osoite = osoite;
		this.postinro= postinro;
		this.postitmp= postitmp;
	}
	
	public Kayttaja(String etunimi, String sukunimi, String osoite, String postinro, String sahkoposti, String kayttajatunnus, String salasana, boolean admin, String postitmp) {
		super();
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.sahkoposti = sahkoposti;
		this.kayttajatunnus = kayttajatunnus;
		this.osoite = osoite;
		this.postinro= postinro;
		this.postitmp= postitmp;
		this.salasana = salasana;
		this.admin = admin;
	}
	
	public Kayttaja() {
		 this.etunimi = "N/A";
		 this.sukunimi = "N/A";
		 this.sahkoposti = "N/A";
		 this.kayttajatunnus = "N/A";
		 this.osoite = "N/A";
		this.postitmp = "N/A";
		this.salasana = "N/A";
		this.admin = false;
		}
	
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getSukunimi() {
		return sukunimi;
	}
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	public String getOsoite() {
		return osoite;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	public String getPostinro() {
		return postinro;
	}
	public void setPostinro(String postinro) {
		this.postinro = postinro;
	}
	public String getSahkoposti() {
		return sahkoposti;
	}
	public void setSahkoposti(String sahkoposti) {
		this.sahkoposti = sahkoposti;
	}
	public String getKayttajatunnus() {
		return kayttajatunnus;
	}
	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}
	public String getSalasana() {
		return salasana;
	}
	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public String getPostitmp() {
		return postitmp;
	}
	public void setPostitmp(String postitmp) {
		this.postitmp = postitmp;
	}
	
	@Override
	public String toString() {
		return "Kayttaja [etunimi=" + etunimi + ", sukunimi=" + sukunimi + ", osoite=" + osoite + ", postinro="
				+ postinro + ", postitmp=" + postitmp + ", sahkoposti=" + sahkoposti + ", kayttajatunnus="
				+ kayttajatunnus + ", salasana=" + salasana + ", admin=" + admin + "]";
	}
	
}
	
	


