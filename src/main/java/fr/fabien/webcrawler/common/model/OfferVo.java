package fr.fabien.webcrawler.common.model;

public class OfferVo {
	
	protected String numeroOffre;

	protected String numeroOffreExterne;
	
	protected String titre;

	protected String url;

	protected String datePublication;
	
	protected String  urlLogo;
	
	protected String entreprise;
	
	protected String adresse;
	
	protected String salaire;
	
	public String getDatePublication() {
		return datePublication;
	}

	public String getTitre() {
		return titre;
	}

	public String getUrl() {
		return url;
	}

	public void setDatePublication(String datePublication) {
		this.datePublication = datePublication;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setUrl(String url) {
		this.url = url;
	}	
	
	public String getNumeroOffreExterne() {
		return numeroOffreExterne;
	}

	public void setNumeroOffreExterne(String numeroOffreExterne) {
		this.numeroOffreExterne = numeroOffreExterne;
	}

	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getNumeroOffre() {
		return numeroOffre;
	}

	public void setNumeroOffre(String numeroOffre) {
		this.numeroOffre = numeroOffre;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "OfferVo [numeroOffre=" + numeroOffre + ", numeroOffreExterne=" + numeroOffreExterne + ", titre=" + titre
				+ ", url=" + url + ", datePublication=" + datePublication + ", urlLogo=" + urlLogo + ", entreprise="
				+ entreprise + ", adresse=" + adresse + ", salaire=" + salaire + "]";
	}

 

}
