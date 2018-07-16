package com.musala.edu.introduction.four;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.musala.edu.introduction.four.words.factory.SingleWordFactory;
import com.musala.edu.introduction.four.words.factory.WordFactory;
import com.musala.edu.introduction.four.words.model.Word;
import com.musala.edu.introduction.four.words.model.WordClass;

/**
 * The {@code TestWordFactory} contains unit tests for the creation of words to
 * be guessed
 * 
 * @author georgi.kavalov
 *
 */
public class TestWordFactory {

	/**
	 * Tests the creation of a noun guess word
	 */
	@Test
	public void testCreateNoun() {
		WordFactory wordFactory = new SingleWordFactory();
		Word newWord = wordFactory.makeGuessWord(WordClass.NOUN);
		assertNotNull(newWord);
		assertNotEquals(new Integer(0), new Integer(newWord.getWordSize()));
	}

	/**
	 * Tests the creation of a noun guess word
	 */
	@Test
	public void testCreateVerb() {
		WordFactory wordFactory = new SingleWordFactory();
		Word newWord = wordFactory.makeGuessWord(WordClass.VERB);
		assertNotNull(newWord);
		assertNotEquals(new Integer(0), new Integer(newWord.getWordSize()));
	}

	/**
	 * Tests the creation of a noun guess word
	 */
	@Test
	public void testCreateAdjective() {
		WordFactory wordFactory = new SingleWordFactory();
		Word newWord = wordFactory.makeGuessWord(WordClass.ADJECTIVE);
		assertNotNull(newWord);
		assertNotEquals(new Integer(0), new Integer(newWord.getWordSize()));
	}
}
