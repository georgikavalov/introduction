package com.musala.edu.introduction.four.words.model;

public abstract class Word {
	private String guessWord;
	private int wordSize;

	public Word(String word) {
		this.guessWord = word;
		this.wordSize = word.length();
	}

	public int getWordSize() {
		return this.wordSize;
	}

	public boolean containsLetter(String letter) {
		return guessWord.contains(letter);
	}
}
