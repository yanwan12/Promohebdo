package com.yanwann.java;

import java.util.ArrayList;

public class Etudiant {
	public String nom;
	public String prenom;
	public int age;
	public char sexe;
	public ArrayList<Note> note;

	public Etudiant(String nom, String prenom, int age, char sexe) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.sexe = sexe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public ArrayList<Note> getNote() {
		return note;
	}

	public void setNote(ArrayList<Note> note) {
		this.note = note;
	}
}