package com.yanwann.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Etudiant {
	private String nom;
	private String prenom;
	private int age;
	private char sexe;
	private ArrayList<Note> note;

	public Etudiant() {
		this("", "", 0, 'M');
		this.note = new ArrayList<Note>();
	}

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

	public Etudiant menuEtu(Scanner scan, Etudiant etu) {
		System.out.println("Nom :");
		scan.nextLine();
		String nom = scan.nextLine();
		System.out.println("Prenom :");
		String prenom = scan.nextLine();
		System.out.println("Age :");
		int age = scan.nextInt();
		System.out.println("Sexe :");
		String str = scan.next();
		char sexe = str.charAt(0);
		etu.setNom(nom);
		etu.setPrenom(prenom);
		etu.setAge(age);
		etu.setSexe(sexe);
		return etu;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + sexe;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		if (age != other.age)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (sexe != other.sexe)
			return false;
		return true;
	}


}
