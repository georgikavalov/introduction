package com.musala.edu.introduction.four.words.factory;

import com.musala.edu.introduction.four.words.model.Word;
import com.musala.edu.introduction.four.words.model.WordClass;

/**
 * {@code WordFactory} is an interface for creating guess words
 * 
 * @author georgi.kavalov
 *
 */
public interface WordFactory {
	public Word makeGuessWord(WordClass wordClass);
}
