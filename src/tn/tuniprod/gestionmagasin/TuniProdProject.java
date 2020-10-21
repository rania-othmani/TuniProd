/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author othma_darbdli
 */
public class TuniProdProject {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
                Produit produit = new Produit();
		Produit produit1 = new Produit(1021,"LAit","Delice",0.700);
		Produit produit2 = new Produit(2510,"Yaourt","Vitalait", 0.500);
		Produit produit3 = new Produit(3250,"Tomate","Sicam",1.200);
		
		System.out.println(produit);
		System.out.println(produit1);
		System.out.println(produit2);
		System.out.println(produit3);
		System.out.println("-------------------------------------------------------");

		
             SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

		produit1.setDateExp(formatter.parse("10/25/2021"));
		produit2.setDateExp(formatter.parse("11/29/2021"));
		produit3.setDateExp(formatter.parse("09/25/2021"));
		System.out.println( produit1 + "\n" + produit2 + "\n" +produit3);

		
		System.out.println("-------------------------------------------------------");

		Magasin magasin1 = new Magasin(1,"Tunis");
		magasin1.add(produit1);
		System.out.println(magasin1);
		System.out.println("Le nombre totale des produits est egale à " +magasin1.nbreProduit);
		System.out.println("-------------------------------------------------------");
                
                
                
		Caissier caissier1 = new Caissier(1, "rania", "tunis", 20,3);
		Caissier caissier2 = new Caissier(2, "rim", "ariana", 28,2);
                Vendeur vendeur = new Vendeur(3, "ahmed", "elkef", 40,50);
		Responsable resp = new Responsable(4, "bilel", "tunis", 40,100);
		Magasin carrefour = new Magasin(1,"Centre-Ville");
		Magasin monoprix = new Magasin(2,"Menzah 6");
                carrefour.add(produit1);
                carrefour.add(produit2);                  
                carrefour.add(produit3);
                monoprix.add(produit1);
                monoprix.add(produit2);                  
                monoprix.add(produit3);
                
                carrefour.addEmp(caissier1);
                carrefour.addEmp(caissier2);
                carrefour.addEmp(vendeur);
                carrefour.addEmp(resp);
                System.out.println(carrefour);
		
                

		Caissier caissier3 = new Caissier(1, "amjed", "megrine", 20,1);
		Vendeur vendeur1 = new Vendeur(2, "amal", "sousse", 40,10);
		Vendeur vendeur2 = new Vendeur(3, "ines", "gabes", 28,40);
		Vendeur vendeur3 = new Vendeur(4, "houyem", "tunis", 40,20);
		Responsable resp1 = new Responsable(5,"yosr", "tunis", 40, 200);
		monoprix.addEmp(caissier3);
		monoprix.addEmp(vendeur1);
		monoprix.addEmp(vendeur2);
		monoprix.addEmp(vendeur3);
		monoprix.addEmp(resp1);
                System.out.println(monoprix);
             


    }
    
}
