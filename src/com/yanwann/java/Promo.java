package com.yanwann.java;

import java.util.ArrayList;

public class Promo {
	public ArrayList<Etudiant> etudiant;
	public String nom;
	public String annee;
	
	public Promo(String nom,String annee) 
	{
		this.nom = nom;
		this.annee = annee;
		
	}
	

	public String getNom() {
		return nom;
	}

	public ArrayList<Etudiant> getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(ArrayList<Etudiant> etudiant) {
		this.etudiant = etudiant;
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
		
}
