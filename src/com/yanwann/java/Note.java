package com.yanwann.java;

import java.util.Scanner;

public class Note {

	private float note;
	
	public Note (float note) {
		
		this.note = note;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	
	public void saisirNote(Scanner sc) {
		System.out.print("Saisissez une note: ");
		float note = sc.nextFloat();
		this.setNote(note);
		
		
	}
}
