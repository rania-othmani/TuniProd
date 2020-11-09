package tn.tuniprod.gestionmagasin;

public class Caissier extends Employe {

	public int numeroDeCaisse;
	public Caissier(int idEmp,String nom, String adresseEmp, int nbre_heures, int numeroDeCaisse) {
            super(idEmp, nom, adresseEmp, nbre_heures);
            this.numeroDeCaisse=numeroDeCaisse;

	}

    @Override
    public String toString() {
        return "Caissier{" + "numeroDeCaisse=" + numeroDeCaisse + '}'+" "+ super.toString();
    }

        
       

    @Override
    public float getSalaireEmploye() {
float salaire = 0;
        int nbrHeureSup = 0;
        int nbrDeBase = 0;
        if (nbre_heures > 180) {
            nbrHeureSup = nbre_heures - 180;
            nbrDeBase = 180;
        } else {
            nbrHeureSup = 0;
            nbrDeBase = nbre_heures;
        }
        salaire = (float) ((nbrDeBase * 10) + (10 * 1.15 * nbrHeureSup));
        return salaire;    }
}
