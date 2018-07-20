package com.musala.edu.introduction.four.words.factory.model;

import java.util.Random;

/**
 * The {@code Noun} object generates a random noun guess word
 * 
 * @author georgi.kavalov
 *
 */
public class Noun extends Word {
	private static String[] words = new String[] { "paedophile", "brick", "scapegoat", "tournament", "software",
			"trickery", "glory", "president", "carelessness", "chocolate" };

	/**
	 * Constructor
	 */
	public Noun() {
		super(words[new Random().nextInt(words.length)]);
	}
}
