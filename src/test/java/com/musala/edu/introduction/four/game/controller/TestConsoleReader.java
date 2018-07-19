package com.musala.edu.introduction.four.game.controller;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;

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
	// @Test
	public void testCustomInput() {
		final String inputLetter = "a";
		HangmanConsoleReader reader = new HangmanConsoleReader(new ByteArrayInputStream(inputLetter.getBytes()));
		assertTrue(reader.takeUserInput());
		String readLetter = reader.getNextLetter();
		assertArrayEquals(new String[] { inputLetter }, new String[] { readLetter });
	}

	/**
	 * Tests press of an Escape key
	 */
	// @Test
	public void testEscapeKey() {
		final String escapeKey = "quit";
		HangmanConsoleReader reader = new HangmanConsoleReader(new ByteArrayInputStream(escapeKey.getBytes()));
		assertFalse(reader.takeUserInput());
		String readLetter = reader.getNextLetter();
		assertArrayEquals(new String[] { "" }, new String[] { readLetter });
	}

	@Test
	public void testManualEscape() {
		HangmanConsoleReader reader = new HangmanConsoleReader();
		reader.takeUserInput();
		String readLetter = reader.getNextLetter();
		assertArrayEquals(new String[] { "" }, new String[] { readLetter });
	}
}
