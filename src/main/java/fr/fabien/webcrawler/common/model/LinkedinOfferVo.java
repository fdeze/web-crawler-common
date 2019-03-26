package fr.fabien.webcrawler.common.model;

 
public class LinkedinOfferVo extends AbstractOfferVo {

	private String lieu;

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	@Override
	public String toString() {
		return "LinkedinOfferVo [lieu=" + lieu + "]";
	}
	

}
