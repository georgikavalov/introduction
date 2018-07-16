package com.musala.edu.introduction.four.words.model;

public class Noun extends Word {

	private static String[] words = new String[] { "paedophile", "brick", "scapegoat", "tournament", "software",
			"trickery", "glory", "president", "carelessness", "chocolate" };

	public Noun() {
		super(words[(int) (Math.random() * words.length)]);
	}
}
