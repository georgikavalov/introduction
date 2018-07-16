package com.musala.edu.introduction.four.words.model;

/**
 * The {@code Word} object represents a guess word
 * 
 * @author georgi.kavalov
 *
 */
public abstract class Word {
	private String guessWord;
	private int wordSize;

	/**
	 * Constructor
	 * 
	 * @param word
	 *            The guess word, hidden from the player
	 */
	public Word(String word) {
		this.guessWord = word;
		this.wordSize = word.length();
	}

	/**
	 * @return the amount of letters the word is made of.
	 */
	public int getWordSize() {
		return this.wordSize;
	}

	/**
	 * Checks whether the guess word contains a specific letter
	 * 
	 * @param letter
	 *            to be checked if it is contained in the guess word
	 * @return A boolean flag
	 */
	public boolean containsLetter(String letter) {
		return guessWord.contains(letter);
	}
}
