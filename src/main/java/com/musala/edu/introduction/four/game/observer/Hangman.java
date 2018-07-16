package com.musala.edu.introduction.four.game.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.musala.edu.introduction.four.words.factory.WordFactory;
import com.musala.edu.introduction.four.words.model.Word;

/**
 * The {@code Hangman} object represents the subject from the observer pattern.
 * 
 * @author georgi.kavalov
 *
 */
public class Hangman {
	private static final Logger LOGGER = LoggerFactory.getLogger(Hangman.class);
	private WordFactory wordFactory;

	/**
	 * Constructor
	 * 
	 * @param wordFactory
	 */
	public Hangman(WordFactory wordFactory) {
		this.wordFactory = wordFactory;
	}

	/**
	 * Starts a game by creating a word of random class for the player to guess
	 */
	public void play() {
		Word guessWord = wordFactory.makeRandomGuessWord();

		LOGGER.info("{} is generated to be guessed by the player.", guessWord.getClass().getSimpleName());
	}
}