package tn.tuniprod.gestionmagasin;

public class Caissier extends Employe {

	public int numeroDeCaisse;
	public Caissier(int idEmp,String nom, String adresseEmp, int nbre_heures, int numeroDeCaisse) {
            super(idEmp, nom, adresseEmp, nbre_heures);
            this.numeroDeCaisse=numeroDeCaisse;

	}

        
        @Override
        public String toString(){
        return "Caissier [idEmp=" + idEmp + ", nom=" + nom + ", adresseEmp=" + adresseEmp + ", nbre_heures=" + nbre_heures + ", numeroDeCaisse="
				+ numeroDeCaisse +  "]";
        }
}
