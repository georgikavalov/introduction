package com.musala.edu.introduction.four.words.factory.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * The {@code TestWord} consists of unit tests for the {@link Word} model object
 * 
 * @author georgi.kavalov
 *
 */
public class TestWord {

	private static final String CONCUBINE_STRING = "concubine";
	private Word newWord = new UserWord(CONCUBINE_STRING);

	/**
	 * Tests guessing a letter.
	 */
	@Test
	public void testGuessLetter() {
		assertTrue(newWord.containsLetter('b'));
	}

	/**
	 * Tests getting positions for a guess letter.
	 */
	@Test
	public void testGetLetterPositions() {
		assertArrayEquals(newWord.getLetterPositions('c').toArray(), new Integer[] { 0, 3 });
	}

	/**
	 * Tests guessing a non existent letter.
	 */
	@Test
	public void testLetterNotFound() {
		final char nonExistentLetter = '!';
		assertFalse(newWord.containsLetter(nonExistentLetter));
		assertFalse(newWord.getLetterPositions(nonExistentLetter).size() > 0);
	}

	/**
	 * Tests the getting of the word size
	 */
	@Test
	public void testWordSize() {
		assertArrayEquals(new int[] { newWord.getWordSize() }, new int[] { CONCUBINE_STRING.length() });
	}
}