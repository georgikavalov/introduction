package com.musala.edu.introduction.four.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.musala.edu.introduction.four.game.controller.GameController;
import com.musala.edu.introduction.four.game.controller.model.HangmanConsoleReader;
import com.musala.edu.introduction.four.words.factory.WordFactory;
import com.musala.edu.introduction.four.words.factory.model.Word;

/**
 * The {@code Hangman} represents game application.
 * 
 * @author georgi.kavalov
 *
 */
public class Hangman {
	private static final Logger LOGGER = LoggerFactory.getLogger(Hangman.class);
	private WordFactory wordFactory;
	private GameController gameController;
	private Winner winner;

	/**
	 * Constructor
	 * 
	 * @param wordFactory
	 */
	public Hangman(WordFactory wordFactory, HangmanConsoleReader reader) {
		this.wordFactory = wordFactory;
		this.gameController = new GameController(reader);
		this.winner = Winner.NONE;
	}

	/**
	 * Starts a game by creating a word of random class for the player to guess and
	 * allows user control via the game controller
	 */
	public void play() {
		Word guessWord = wordFactory.makeRandomGuessWord();
		LOGGER.info("{} is generated to be guessed by the player.", guessWord.getClass().getSimpleName());
		winner = gameController.playGame(guessWord);
	}

	/**
	 * Indicates whether the player has won or not
	 * 
	 * @return A boolean flag for validity of player's correctly guessing the
	 *         guessword
	 */
	public boolean hasPlayerWon() {
		return winner == Winner.PLAYER;
	}
}