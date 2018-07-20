package com.musala.edu.introduction.four.game.controller;

import com.musala.edu.introduction.four.words.factory.model.Word;

public class GameController {

	private HangmanConsoleReader reader;
	private WordDisplay wordDisplay;

	public GameController(HangmanConsoleReader reader) {
		this.reader = reader;
	}

	public void playGame(Word guessWord) {
		wordDisplay = new WordDisplay(guessWord);
		while (reader.takeUserInput()) {
			String usersGuess = reader.getUserInput();
			if (!wordDisplay.showLetters(usersGuess)) {
				// gallows.update()
			}

			if (isGameOver()) {
				break;
			}
		}
		reader.closeReader();
	}

	private boolean isGameOver() {
		return wordDisplay.isWordRevealed(); // || gallows.isHung();
	}
}