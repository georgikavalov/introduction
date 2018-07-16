package com.musala.edu.introduction.four.words.factory;

import com.musala.edu.introduction.four.words.model.Word;
import com.musala.edu.introduction.four.words.model.WordClass;

public interface WordFactory {
	public Word makeGuessWord(WordClass wordClass);
}
