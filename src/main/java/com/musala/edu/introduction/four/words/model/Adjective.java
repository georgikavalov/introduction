package com.musala.edu.introduction.four.words.model;

public class Adjective extends Word {

	private static String[] words = new String[] { "disguisting", "thoughtful", "mysterious", "enthusiastic",
			"important", "stubborn", "thickheaded", "extraordinary", "courageous", "conservative" };

	public Adjective() {
		super(words[(int) (Math.random() * words.length)]);
	}
}
