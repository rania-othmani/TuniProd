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
public abstract class ProduitAgricole extends ProduitAlimentaire implements Critere{
    //int id;
    //String type;
    //String libelle;
    float quantite;
    String saison;

    public ProduitAgricole(float quantite, String saison, int identifiant, String libelle, String marque, float prix) throws PrixNegatifException {
        super(identifiant, libelle, marque, prix);
        this.quantite = quantite;
        this.saison = saison;
    }
}