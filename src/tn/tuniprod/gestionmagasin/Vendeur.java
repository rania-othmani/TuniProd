package tn.tuniprod.gestionmagasin;

public class Vendeur extends Employe{

	public float tauxDeVente;
	public Vendeur(int idEmp,String nom, String adresseEmp, int nbre_heures, float tauxDeVente) {
		super(idEmp, nom, adresseEmp, nbre_heures);
		this.tauxDeVente=tauxDeVente;
	}

    @Override
    public String toString() {
        return "Vendeur{" + "tauxDeVente=" + tauxDeVente + '}' + " " + super.toString();
    }

    

    @Override
    public float getSalaireEmploye() {
       float salaire = 0;
       salaire = (450 * (tauxDeVente/100))+450;
       return salaire;
    }

}
