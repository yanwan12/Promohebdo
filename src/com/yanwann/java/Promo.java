package com.yanwann.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Promo {
	private ArrayList<Etudiant> listetudiants;
	private String nom;
	private String annee;

	public Promo(String nom, String annee) {
		this.nom = nom;
		this.annee = annee;
	}

	public Promo() {
		this("", "");
		this.listetudiants = new ArrayList<Etudiant>();
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Etudiant> getEtudiant() {
		return listetudiants;
	}

	public void setEtudiant(ArrayList<Etudiant> listetudiants) {
		this.listetudiants = listetudiants;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public void addEtudiant(Scanner sc) {
		Etudiant etu = new Etudiant();
		etu = etu.menuEtu(sc, etu);
		this.listetudiants.add(etu);

	}

	public void addPromo(Scanner sc) {
		System.out.print("Nom : \n");
		String nom = sc.nextLine();
		System.out.print("Année :\n");
		String annee = sc.nextLine();
		this.setNom(nom);
		this.setAnnee(annee);
	}

	public Etudiant cherchEtudiant(Etudiant e, Scanner sc) {
		e = e.menuEtu(sc, e);
		for (Etudiant etu : listetudiants) {
			if (e.equals(etu)) {
				return e;
			} else {
				return e = null;
			}
		}
		return e;
	}

	public void supEtudiant(Scanner sc) {
		Etudiant etu = new Etudiant();
		etu = this.cherchEtudiant(etu, sc);
		if (!etu.equals(null)) {
			this.listetudiants.remove(etu);
			System.out.println("Etudiant Supprimé \n");
		}
		System.out.println("Aucun Etudiant Trouvé");
	}

	public void afficheEtudiant(Scanner sc) {
		Etudiant e = new Etudiant();
		e = this.cherchEtudiant(e, sc);
		if (!e.equals(null)) {
			System.out.println("L'Etudiant demandé s'appelle " + e.getPrenom() + " " + e.getNom() + " a " + e.getAge()
					+ " c'est un(e) " + e.getSexe());
		}else {
		System.out.println("Aucun étudiant Trouvé");
		}
	}

	public void liste() {
		for (Etudiant e : listetudiants)
			System.out.println(" " + e.getPrenom() + " " + e.getNom() + " " + e.getAge() + " " + e.getSexe());
	}
}
