package com.musala.edu.introduction.four.game.controller.model;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.musala.edu.introduction.four.words.factory.model.Word;

/**
 * The {@code WordDisplay} encapsualtes functionality of displaying a guess word
 * 
 * @author georgi.kavalov
 *
 */
public class WordDisplay {

	private static final Logger CONSOLE = LoggerFactory.getLogger(WordDisplay.class);
	private Word guessWord;
	private char[] playersWord;

	public WordDisplay(Word guessWord) {
		this.guessWord = guessWord;
		this.playersWord = new char[guessWord.getWordSize()];
		Arrays.fill(playersWord, '_');
		CONSOLE.info("Playing a word of {} letters", guessWord.getWordSize());
		displayWord();
	}

	/**
	 * Shows all occurrences of a letter
	 * 
	 * @param usersGuess
	 *            Guessed letter
	 * @return A boolean flag indicating if the guessed letter is present
	 */
	public boolean showLetters(char usersGuess) {
		boolean retVal = usersGuess == '\n' || guessWord.containsLetter(usersGuess);
		if (retVal) {
			if (usersGuess != '\n') {
				for (Integer pos : guessWord.getLetterPositions(usersGuess)) {
					playersWord[pos] = usersGuess;
				}
				displayWord();
			} else {
				CONSOLE.info("You have entered an empty character, please try again.");
			}
		} else {
			CONSOLE.info("\'{}\' is not contained in the guess word", usersGuess);
		}
		return retVal;
	}

	/**
	 * Displays guess word so far.
	 */
	private void displayWord() {
		CONSOLE.info("{}", playersWord);
	}

	/**
	 * Checks if all letter have been guessed.
	 * 
	 * @return A boolean flag indicating guess completeness.
	 */
	public boolean isWordRevealed() {
		boolean retVal = !Arrays.toString(playersWord).contains("_");
		if (retVal) {
			CONSOLE.info("You won :)");
		}
		return retVal;
	}
}