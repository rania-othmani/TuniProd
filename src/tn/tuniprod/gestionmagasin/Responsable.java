package tn.tuniprod.gestionmagasin;

public class Responsable extends Employe{

	public double prime;
	public Responsable(int idEmp,String nom, String adresseEmp, int nbre_heures, double prime) {
		super(idEmp, nom, adresseEmp, nbre_heures);
		this.prime=prime;
	}

    @Override
    public String toString() {
        return "Responsable[idEmp=" + idEmp + ", nom=" + nom + ", adresseEmp=" + adresseEmp + ", nbre_heures=" + nbre_heures + ",prime=" + prime + "]";
    }

}
