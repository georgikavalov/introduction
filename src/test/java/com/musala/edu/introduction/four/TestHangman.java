package com.musala.edu.introduction.four;

import org.junit.Test;

import com.musala.edu.introduction.four.game.observer.Hangman;
import com.musala.edu.introduction.four.words.factory.SingleWordFactory;

/**
 * The {@code TestHangman} class contains unit tests for the Hangman application
 * 
 * @author georgi.kavalov
 *
 */
public class TestHangman {

	/**
	 * Tests starting a game of hangman
	 */
	@Test
	public void testHangmanGameStart() {
		Hangman game = new Hangman(new SingleWordFactory());
		game.play();
	}
}