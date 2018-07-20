package com.musala.edu.introduction.four.words.factory.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.musala.edu.introduction.four.words.factory.model.Noun;
import com.musala.edu.introduction.four.words.factory.model.Word;

/**
 * The {@code TestWord} consists of unit tests for the {@link Word} model object
 * 
 * @author georgi.kavalov
 *
 */
public class TestWord {

	private Word newWord = new Noun();

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	/**
	 * Tests guessing a letter.
	 */
	@Test
	public void testGuessLetter() {
		boolean foundALetter = false;
		int i = 0;
		while (!foundALetter || ALPHABET.length() == i) {
			foundALetter = newWord.containsLetter(Character.toString(ALPHABET.charAt(i++)));
		}
		assertTrue(foundALetter);
	}

	/**
	 * Tests getting positions for a guess letter.
	 */
	@Test
	public void testGetLetterPositions() {
		boolean foundALetter = false;
		String letter = "";
		int i = 0;
		while (!foundALetter || ALPHABET.length() == i) {
			letter = Character.toString(ALPHABET.charAt(i++));
			foundALetter = newWord.containsLetter(letter);
		}
		assertTrue(newWord.getLetterPositions(letter).size() > 0);
	}

	/**
	 * Tests guessing a non existent letter.
	 */
	@Test
	public void testLetterNotFound() {
		final String nonExistentLetter = "!";
		assertFalse(newWord.containsLetter(nonExistentLetter));
		assertFalse(newWord.getLetterPositions(nonExistentLetter).size() > 0);
	}
}
