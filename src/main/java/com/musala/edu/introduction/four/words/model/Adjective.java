package com.musala.edu.introduction.four.words.model;

import java.util.Random;

/**
 * The {@code Adjective} object generates a random adjective guess word
 * 
 * @author georgi.kavalov
 *
 */
public class Adjective extends Word {

	private static String[] words = new String[] { "disguisting", "thoughtful", "mysterious", "enthusiastic",
			"important", "stubborn", "thickheaded", "extraordinary", "courageous", "conservative" };

	/**
	 * Constructor
	 */
	public Adjective() {
		super(words[new Random().nextInt(words.length)]);
	}
}
