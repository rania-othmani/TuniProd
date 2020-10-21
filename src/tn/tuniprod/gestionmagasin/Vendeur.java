package tn.tuniprod.gestionmagasin;

public class Vendeur extends Employe{

	public double tauxDeVente;
	public Vendeur(int idEmp,String nom, String adresseEmp, int nbre_heures, double tauxDeVente) {
		super(idEmp, nom, adresseEmp, nbre_heures);
		this.tauxDeVente=tauxDeVente;
	}

    @Override
    public String toString() {
        return "Vendeur[idEmp=" + idEmp + ", nom=" + nom + ", adresseEmp=" + adresseEmp + ", nbre_heures=" + nbre_heures + ", tauxDeVente=" + tauxDeVente + "]";

    }

}
