package com.musala.edu.introduction.four.game.controller;

import org.junit.Test;

import com.musala.edu.introduction.four.words.factory.model.UserWord;
import com.musala.edu.introduction.four.words.factory.model.Word;

/**
 * The {@code TestGameController} contains unit tests for the controller
 * 
 * @author georgi.kavalov
 *
 */
public class TestGameController {

	private Word newWord = new UserWord("concubine");

	/**
	 * Tests making a guess
	 */
	@Test
	public void testMakeAGuess() {
		GameController gameController = new GameController(new HangmanConsoleReader(new String[] { "a", "quit" }));

		gameController.playGame(newWord);
	}
}