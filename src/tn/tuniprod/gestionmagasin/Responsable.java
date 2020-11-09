package tn.tuniprod.gestionmagasin;

public class Responsable extends Employe{

	public double prime;
	public Responsable(int idEmp,String nom, String adresseEmp, int nbre_heures, double prime) {
		super(idEmp, nom, adresseEmp, nbre_heures);
		this.prime=prime;
	}

    @Override
    public String toString() {
        return "Responsable{" + "prime=" + prime + '}' + " " + super.toString();
    }

    

    @Override
    public float getSalaireEmploye() {
        float salaire =0;
        int nbrHeureSup = 0;
        int nbrHeureBase = 0;
        if(nbre_heures > 160){
            nbrHeureSup = nbre_heures - 160;
            nbrHeureBase = 160;
        }else {
            nbrHeureSup = 0;
            nbrHeureBase = nbre_heures;
        
        }
        salaire = (float)((nbrHeureBase * 10)+(10* 1.2 * nbrHeureSup));
        salaire+=prime;
        return salaire;

    }

}
