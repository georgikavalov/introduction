package com.musala.edu.introduction.four.game.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.musala.edu.introduction.four.words.factory.model.Word;

public class WordDisplay {

	private static final Logger CONSOLE = LoggerFactory.getLogger(WordDisplay.class);
	private Word guessWord;

	public WordDisplay(Word guessWord) {
		this.guessWord = guessWord;
		CONSOLE.info("Playing a word of {} letters", guessWord.getWordSize());
		displayWord("", null);
	}

	public boolean showLetters(String usersGuess) {
		boolean retVal = guessWord.containsLetter(usersGuess);
		if (retVal) {
			displayWord(usersGuess, guessWord.getLetterPositions(usersGuess));
		}
		return retVal;
	}

	private void displayWord(String usersGuess, List<Integer> letterPositions) {
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < guessWord.getWordSize(); i++) {
			if (letterPositions != null && letterPositions.contains(i)) {
				word.append(usersGuess + " ");
			} else {
				word.append("_ ");
			}
		}
		CONSOLE.info("{}", word);
	}

	public boolean isWordRevealed() {
		boolean retVal = guessWord.isGuessed();
		if (retVal) {
			CONSOLE.info("You won :)");
		}
		return retVal;
	}
}