package com.musala.edu.introduction.four.game.controller.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * The {@code TestConsoleReader} consists of unit tests for the
 * {@link HangmanConsoleReader}
 * 
 * @author georgi.kavalov
 *
 */
public class TestConsoleReader {

	/**
	 * Tests custom input stream.
	 */
	@Test
	public void testCustomCharInput() {
		final String[] inputLetters = { "a", "b", "", " ", " C " };
		HangmanConsoleReader reader = new HangmanConsoleReader(inputLetters);
		List<String> readLetters = new LinkedList<String>();
		for (int i = 0; i < inputLetters.length; i++) {
			assertTrue(reader.takeUserInput());
			readLetters.add(reader.getUserInput());
		}
		assertArrayEquals(new String[] { "a", "b", "\n", "\n", "c" }, readLetters.toArray());
		reader.closeReader();
	}

	/**
	 * Tests user input from more than one letter
	 */
	@Test
	public void testWordInput() {
		final String[] wordInput = { "woord", " woord " };
		HangmanConsoleReader reader = new HangmanConsoleReader(wordInput);
		List<String> readWords = new LinkedList<String>();
		for (int i = 0; i < wordInput.length; i++) {
			assertTrue(reader.takeUserInput());
			readWords.add(reader.getUserInput());
		}
		assertArrayEquals(new String[] { "w", "w" }, readWords.toArray());
	}

	/**
	 * Tests taking a quit keyword
	 */
	@Test
	public void testEscapeKey() {
		final String[] testInput = { "quit" };
		HangmanConsoleReader reader = new HangmanConsoleReader(testInput);
		assertFalse(reader.takeUserInput());
		String readLetter = reader.getUserInput();
		assertArrayEquals(new String[] { "" }, new String[] { readLetter });
		reader.closeReader();
	}
}
