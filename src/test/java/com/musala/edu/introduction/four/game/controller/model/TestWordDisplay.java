package com.musala.edu.introduction.four.game.controller.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.musala.edu.introduction.four.words.factory.model.UserWord;

/**
 * The {@code TestWordDisplay} consists of unit test for the WordDisplay
 * 
 * @author georgi.kavalov
 *
 */
public class TestWordDisplay {

	private WordDisplay wordDisplay = new WordDisplay(new UserWord("abca"));

	/**
	 * Tests showing of existing and non existing letters
	 */
	@Test
	public void testShowLetters() {
		assertTrue(wordDisplay.showLetters('a'));
		assertTrue(wordDisplay.showLetters('\n'));
		assertFalse(wordDisplay.showLetters('z'));
	}

	/**
	 * Tests completing guessing a word
	 */
	@Test
	public void testWordIsRevealed() {
		wordDisplay.showLetters('a');
		wordDisplay.showLetters('b');
		assertFalse(wordDisplay.isWordRevealed());
		wordDisplay.showLetters('c');
		assertTrue(wordDisplay.isWordRevealed());
	}
}
