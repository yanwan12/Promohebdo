package com.yanwann.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Promo prom = new Promo();
		String choix = "";
		
		System.out.println("Nouvelle promotion \n");

		prom.addPromo(sc);

		

		while (!choix.equals("q")) {
		choix = "";
		System.out.println("Choix : ");
		System.out.println("1: Ajouter Etudiant");
		System.out.println("2: Supprimer Etudiant");
		System.out.println("3: Afficher Etudiant");
		System.out.println("4: Ajouter Note");
		System.out.println("5: Supprimer note");
		System.out.println("6: Moyenne Promo");
		System.out.println("?: Choix");
		System.out.println("q: Quitter");
		choix = sc.next();
			switch (choix) {
			case "1":
				prom.addEtudiant(sc);			
				break;

			case "2":
				prom.supEtudiant(sc);
				break;
			
			case "3":
				prom.liste();
				break;
			
		//	case "4":
			}// end switch
 
		} // end While

	}// end main

}
