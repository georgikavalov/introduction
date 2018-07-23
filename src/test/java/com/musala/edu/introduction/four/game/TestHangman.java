package com.musala.edu.introduction.four.game;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.musala.edu.introduction.four.game.controller.model.HangmanConsoleReader;
import com.musala.edu.introduction.four.words.factory.SingleWordFactory;

/**
 * The {@code TestHangman} class contains unit tests for the Hangman application
 * 
 * @author georgi.kavalov
 *
 */
public class TestHangman {

	/**
	 * Tests losing a game of hangman
	 */
	@Test
	public void testHangmanGameStart() {
		Hangman game = new Hangman(new SingleWordFactory(), new HangmanConsoleReader(
				new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n" }));
		game.play();
		assertFalse(game.hasPlayerWon());
	}
}