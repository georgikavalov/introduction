package com.musala.edu.introduction.four.game.controller;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import com.musala.edu.introduction.four.words.model.Verb;
import com.musala.edu.introduction.four.words.model.Word;

/**
 * The {@code TestGameController} contains unit tests for the controller
 * 
 * @author georgi.kavalov
 *
 */
public class TestGameController {

	private Word newWord = new Verb();

	/**
	 * Tests making a guess
	 */
	@Test
	public void testMakeAGuess() {
		GameController gameController = new GameController(
				new HangmanConsoleReader(new ByteArrayInputStream("a".getBytes())));

		gameController.playGame(newWord);
	}
}