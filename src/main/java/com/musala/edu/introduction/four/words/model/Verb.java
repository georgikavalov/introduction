package com.musala.edu.introduction.four.words.model;

public class Verb extends Word {
	private static String[] words = new String[] { "fish", "program", "fence", "frack", "build", "shine", "forecast",
			"spread", "assemble", "coordinate" };

	public Verb() {
		super(words[(int) (Math.random() * words.length)]);
	}
}
