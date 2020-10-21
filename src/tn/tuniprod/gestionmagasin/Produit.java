package tn.tuniprod.gestionmagasin;
import java.util.Date;
import java.util.Objects;

public class Produit {
	private int id;
	private String libelle;
	private String marque;
	private double prix;
	private Date dateExp;
    
    public Produit() {}

	/*
	 * public Produit (int id, String libelle, String marque) { setId(id);
	 * setLibelle(libelle); setMarque(marque); }
	 */    
    public Produit (int id, String libelle, String marque, double prix) {
    	setId(id);
    	setLibelle(libelle);
    	setMarque(marque);
    	setPrix(prix);
    }
    
    public Produit (int id, String libelle, String marque, double prix, Date dateExp) {
    	setId(id);
    	setLibelle(libelle);
    	setMarque(marque);
    	setPrix(prix);
    	setDateExp(dateExp);    	
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return id == produit.id &&
                Double.compare(produit.prix, prix) == 0 &&
                Objects.equals(libelle, produit.libelle);
    }
    
    
	@Override
	public String toString() {
		return "Produit{" +
                "id = " + id +
                ", libelle = '" + libelle + '\'' +
                ", marque = '" + marque + '\'' +
                ", prix = " + prix +
                ", dateExp = " + dateExp +
                '}';	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Date getDateExp() {
		return dateExp;
	}
	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}
	
}
