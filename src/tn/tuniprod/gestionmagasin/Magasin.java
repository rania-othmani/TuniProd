/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

/**
 *
 * @author othma_darbdli
 */
public class Magasin {

    int id;
    String adresse;
    String nom;
    int capacite = 50;
    ProduitAlimentaire[] produits;
    int nbreEmploye;
    Employe[] employes = new Employe[20];

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.produits = new ProduitAlimentaire[2];
    }

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.produits = new ProduitAlimentaire[50];
        this.nom = nom;
    }

    public void addEmp(Employe employe) {
        this.employes[nbreEmploye] = employe;
        this.nbreEmploye++;
    }

    public void add(ProduitAlimentaire produit) throws MagasinPleinException {
        if (this.capacite == 2) {
            throw (new MagasinPleinException("Magasin Plein :::!!"));
        } else if (this.chercher(produit)) {
            System.out.println("Produit existant");
        } else {
            this.produits[capacite] = produit;
            this.capacite++;
            System.out.println("Produit Ajouté");
        }
    }
 public boolean chercher(ProduitAlimentaire produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    } 
 
    public static boolean comparer(ProduitAlimentaire produit, ProduitAlimentaire produit2) {
        return produit2.getIdentifiant() == produit.getIdentifiant()
                && produit2.getPrix() == produit.getPrix()
                && produit2.getLibelle() == produit.getLibelle();
    }

   

    public int getIndex(ProduitAlimentaire produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return i;
            }
        }
        return -1;
    }

    public void supprimer(ProduitAlimentaire produit) {
        int pos = this.getIndex(produit);
        if (pos == -1) {

            System.out.println("impossible de supprimer un produit qui n'existe pas dans le magasin");
        } else {
            for (int i = pos; i < capacite; i++) {
                this.produits[i] = this.produits[i + 1];
                this.produits[capacite] = null;
                this.capacite--;

            }
        }
    }

    public Magasin magasinSup(Magasin M) {
        if (this.capacite > M.capacite) {
            return this;
        } else {
            return M;
        }
    }

    public void afficherEmployes() {
        for (int i = 0; i < nbreEmploye; i++) {
            System.out.println(employes[i]);
        }
    }

    public float calculStock() {
        float total = 0;
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].determinerTypeProduit().equals("Fruit")) {
                total += ((ProduitFruit) this.produits[i]).quantite;
            }
        }

        return total;
    }

    @Override
    public String toString() {
        String s = "";
        s += "NOM MAGASIN : " + this.nom + " \n";
        s += "identifiant : " + this.id + " \n";
        s += "adresse : " + this.adresse + " \n";
        s += "capacite : " + this.capacite + " \n";

        String prods = "";
        for (int i = 0; i < this.capacite; i++) {
            prods += this.produits[i];
        }

        String empl = "";
        for (int i = 0; i < this.nbreEmploye; i++) {
            empl += this.employes[i];
        }

        return s + prods + "\n" + empl;
    }

}
