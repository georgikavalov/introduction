package com.musala.edu.introduction.four.game.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.musala.edu.introduction.four.words.model.Word;

public class GameController {

	private static final Logger LOGGER = LoggerFactory.getLogger(GameController.class);
	private HangmanConsoleReader reader;
	private WordDisplay wordDisplay;

	public GameController(HangmanConsoleReader reader) {
		this.reader = reader;
		this.wordDisplay = new WordDisplay();
	}

	public void playGame(Word guessWord) {
		LOGGER.info("Playing a word of {} letters", guessWord.getWordSize());

		while (reader.takeUserInput()) {
			String usersGuess = reader.getNextLetter();
			if (guessWord.containsLetter(usersGuess)) {
				wordDisplay.showLetters(guessWord.getLetterPositions(usersGuess));
			} else {
				// gallows.update();
			}
		}
		reader.closeReader();
	}
}
