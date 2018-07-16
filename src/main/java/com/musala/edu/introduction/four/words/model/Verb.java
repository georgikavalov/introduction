package com.musala.edu.introduction.four.words.model;

import java.util.Random;

/**
 * The {@code Verb} object generates a random verb guess word
 * 
 * @author georgi.kavalov
 *
 */
public class Verb extends Word {
	private static String[] words = new String[] { "fish", "program", "fence", "frack", "build", "shine", "forecast",
			"spread", "assemble", "coordinate" };

	/**
	 * Constructor
	 */
	public Verb() {
		super(words[new Random().nextInt(words.length)]);
	}
}
