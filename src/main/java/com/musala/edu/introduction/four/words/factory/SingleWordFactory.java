package com.musala.edu.introduction.four.words.factory;

import java.util.Random;

import com.musala.edu.introduction.four.words.factory.model.Adjective;
import com.musala.edu.introduction.four.words.factory.model.Noun;
import com.musala.edu.introduction.four.words.factory.model.Verb;
import com.musala.edu.introduction.four.words.factory.model.Word;
import com.musala.edu.introduction.four.words.factory.model.WordClass;

/**
 * {@code SingleWordFactory} is a concrete factory class for creating single
 * guess words
 * 
 * @author georgi.kavalov
 *
 */
public class SingleWordFactory implements WordFactory {

	/**
	 * Creates a random single guess word.
	 * 
	 * @return {@link Word} to be guessed.
	 */
	public Word makeRandomGuessWord() {
		WordClass wordClass = WordClass.values()[new Random().nextInt(WordClass.values().length)];
		return makeGuessWord(wordClass);
	}

	/**
	 * Creates a single guess word of specific word class.
	 * 
	 * @param wordClass
	 *            The desired class of the word.
	 * @return {@link Word} to be guessed.
	 */
	public Word makeGuessWord(WordClass wordClass) {
		switch (wordClass) {
		case NOUN:
			return new Noun();
		case VERB:
			return new Verb();
		case ADJECTIVE:
			return new Adjective();
		default:
			return null;
		}
	}
}