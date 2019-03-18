package fr.fabien.webcrawler.common.model;

public class ApecOfferVo extends AbstractOfferVo {

	String entreprise;

	String salaire;

	String numeroOffre;

	String adresseSiege;

	String adresse;

	String texteHtml;

	String texteEntreprise;

	String texteProfil;

	String urlLogo;
	
	public String getAdresse() {
		return adresse;
	}

	public String getAdresseSiege() {
		return adresseSiege;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public String getNumeroOffre() {
		return numeroOffre;
	}

	public String getSalaire() {
		return salaire;
	}

	public String getTexteEntreprise() {
		return texteEntreprise;
	}

	public String getTexteHtml() {
		return texteHtml;
	}

	public String getTexteProfil() {
		return texteProfil;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setAdresseSiege(String adresseSiege) {
		this.adresseSiege = adresseSiege;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public void setNumeroOffre(String numeroOffre) {
		this.numeroOffre = numeroOffre;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	public void setTexteEntreprise(String texteEntreprise) {
		this.texteEntreprise = texteEntreprise;
	}

	public void setTexteHtml(String texteHtml) {
		this.texteHtml = texteHtml;
	}

	public void setTexteProfil(String texteProfil) {
		this.texteProfil = texteProfil;
	}
	
	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}

	@Override
	public String toString() {
		return "ApecOfferVo [entreprise=" + entreprise + ", salaire=" + salaire + ", numeroOffre=" + numeroOffre
				+ ", adresseSiege=" + adresseSiege + ", adresse=" + adresse + ", texteHtml=" + texteHtml
				+ ", texteEntreprise=" + texteEntreprise + ", texteProfil=" + texteProfil + "]";
	}

}
