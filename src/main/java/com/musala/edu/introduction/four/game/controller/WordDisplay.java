package com.musala.edu.introduction.four.game.controller;

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
		boolean retVal = guessWord.containsLetter(usersGuess);
		if (retVal) {
			for (Integer pos : guessWord.getLetterPositions(usersGuess)) {
				playersWord[pos] = usersGuess;
			}
			displayWord();
		}
		return retVal;
	}

	/**
	 */
	private void displayWord() {
		CONSOLE.info("{}", playersWord);
	}

	/**
	 * 
	 * @return
	 */
	public boolean isWordRevealed() {
		boolean retVal = !Arrays.toString(playersWord).contains("_");
		if (retVal) {
			CONSOLE.info("You won :)");
		}
		return retVal;
	}
}