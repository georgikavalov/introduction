package com.musala.edu.introduction.four.words.factory;

import com.musala.edu.introduction.four.words.model.Adjective;
import com.musala.edu.introduction.four.words.model.Noun;
import com.musala.edu.introduction.four.words.model.Verb;
import com.musala.edu.introduction.four.words.model.Word;
import com.musala.edu.introduction.four.words.model.WordClass;

/**
 * {@code SingleWordFactory} is a concrete factory class for creating single
 * guess words
 * 
 * @author georgi.kavalov
 *
 */
public class SingleWordFactory implements WordFactory {

	/**
	 * Interface method implementation
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