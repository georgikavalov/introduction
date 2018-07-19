package com.musala.edu.introduction.four.words.model;

import java.util.LinkedList;
import java.util.List;

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
		return guessWord.contains(letter.toLowerCase());
	}

	/**
	 * Gets a list of all positions where the guessed letter occurs.
	 * 
	 * @param letter
	 *            Guessed letter
	 * @return List of Integers
	 */
	public List<Integer> getLetterPositions(String letter) {
		List<Integer> positions = new LinkedList<Integer>();
		int beginIndex = guessWord.substring(0).indexOf(letter);
		if (beginIndex != -1) {
			do {
				positions.add(beginIndex++);
				beginIndex += guessWord.substring(beginIndex).indexOf(letter);
			} while (beginIndex < positions.get(positions.size() - 1));
		}
		return positions;
	}
}