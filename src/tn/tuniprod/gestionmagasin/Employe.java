package tn.tuniprod.gestionmagasin;

public abstract class Employe {

	public int idEmp;
	public String nom;
	public String adresseEmp;
	public int nbre_heures;
	
	public Employe(int idEmp, String nom, String adresseEmp, int nbre_heures) {
		this.idEmp = idEmp;
		this.nom=nom;
		this.adresseEmp=adresseEmp;
		this.nbre_heures=nbre_heures;
	}

    @Override
    public String toString() {
        return "Employe{" + "idEmp=" + idEmp + ", nom=" + nom + ", adresseEmp=" + adresseEmp + ", nbre_heures=" + nbre_heures + '}';
    }
		
    public abstract float getSalaireEmploye();
	}
