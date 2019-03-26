package fr.fabien.webcrawler.common.model;

 
public class LinkedinOfferVo extends AbstractOfferVo {

	private String lieu;
	
	private String entreprise;

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	@Override
	public String toString() {
		return "LinkedinOfferVo [lieu=" + lieu + ", entreprise=" + entreprise + "]";
	}
	

}
