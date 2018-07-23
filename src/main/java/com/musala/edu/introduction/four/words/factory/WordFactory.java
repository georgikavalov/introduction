package com.musala.edu.introduction.four.words.factory;

import com.musala.edu.introduction.four.words.factory.model.Word;
import com.musala.edu.introduction.four.words.factory.model.WordClass;

/**
 * {@code WordFactory} is an interface for creating guess words
 * 
 * @author georgi.kavalov
 *
 */
public interface WordFactory {
	/**
	 * Creates a random guess word
	 * 
	 * @return {@link Word} to be guessed.
	 */
	public Word makeRandomGuessWord();

	/**
	 * Creates a guess word of specific class.
	 * 
	 * @param wordClass
	 *            The desired word class
	 * @return {@link Word} to be guessed.
	 */
	public Word makeGuessWord(WordClass wordClass);
}
