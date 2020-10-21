/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

import java.util.Arrays;

/**
 *
 * @author othma_darbdli
 */
public class Magasin {
    public int id;
	public String adresse;
	final int capacite = 50;
	public Produit[] produits;
	public int nbreProduit = 0;
	public int nbreEmploye=0;
	public int nbreEmpMax = 20;
	public Employe[] employes;
	
	public Magasin(int id, String adresse) {
		this.id = id;
        this.adresse = adresse;
     
        this.produits = new Produit[capacite];
        this.employes = new Employe[nbreEmpMax];
	}
	

	public void addEmp(Employe employe) {
		if (nbreEmploye < nbreEmpMax) {
			employes[nbreEmploye] = employe;
			nbreEmploye++;
		}
                else {
			System.out.println("Employe existe!");
		}
	}
	
	public void add(Produit produit) {
		// TODO Auto-generated method stub
		if (nbreProduit < capacite && !comparer(produit)) {
			produits[nbreProduit] = produit;
			nbreProduit++;
		}
		else {
			System.out.println("Ce produit existe!");
		}
	}
	
	public boolean comparer(Produit produit) {
		for(int i = 0 ; i<nbreProduit ; i++ ) 
			if(produits[i].getId() == produit.getId() && produits[i].getLibelle().equals(produit.getLibelle()) && produits[i].getPrix() == produit.getPrix()) {
				return true;
			}
		return false;
		
	}
	
	public int chercher(Produit produit) {
        for (int i = 0; i < nbreProduit; i++)
            if(produits[i].getId() == produit.getId() && produits[i].getLibelle().equals(produit.getLibelle()) && produits[i].getPrix() == produit.getPrix()) {
                return  i;
            }
        return -1;
    }
	
	public void supprimer(Produit produit) {
		int pos = chercher(produit);
        if (pos != -1)
        for (int i = pos; i < nbreProduit ; i++) {

                produits[i] = produits[i + 1];
        }
        nbreProduit--;
	}
	
	public Magasin magasinSup(Magasin M1, Magasin M2) {
		if(M1.nbreProduit>M2.nbreProduit)
			return M1;
		else 
			return M2;
	}
	@Override
	public String toString() {
		return "Magasin [id=" + id + ", adresse=" + adresse + ", capacite=" + capacite + ", produits="
				+ Arrays.toString(produits) + ", nbreProduit=" + nbreProduit + ", employes="+Arrays.toString(employes) + "]";
	}
	
}
