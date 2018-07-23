package com.musala.edu.introduction.four.game.controller;

import com.musala.edu.introduction.four.game.Winner;
import com.musala.edu.introduction.four.game.controller.model.Gallows;
import com.musala.edu.introduction.four.game.controller.model.HangmanConsoleReader;
import com.musala.edu.introduction.four.game.controller.model.WordDisplay;
import com.musala.edu.introduction.four.words.factory.model.Word;

public class GameController {

	private HangmanConsoleReader reader;
	private WordDisplay wordDisplay;
	private Gallows gallows;
	private Winner winner;

	public GameController(HangmanConsoleReader reader) {
		this.reader = reader;
		this.gallows = new Gallows();
		this.winner = Winner.NONE;
	}

	public Winner playGame(Word guessWord) {
		wordDisplay = new WordDisplay(guessWord);
		while (reader.takeUserInput()) {
			if (!wordDisplay.showLetters(reader.getUserInput().charAt(0))) {
				gallows.update();
			}

			if (isGameOver()) {
				break;
			}
		}
		reader.closeReader();
		return winner;
	}

	/**
	 * Indicates if game is completed and assigns type of winner.
	 * 
	 * @return A boolean flag for completeness of a game of hangman.
	 */
	public boolean isGameOver() {
		boolean retVal = false;
		if (wordDisplay.isWordRevealed()) {
			retVal = true;
			winner = Winner.PLAYER;
		} else if (gallows.isHung()) {
			retVal = true;
			winner = Winner.HANGMAN;
		}
		return retVal;
	}
}