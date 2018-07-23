package com.musala.edu.introduction.four.game;

import com.musala.edu.introduction.four.game.controller.model.HangmanConsoleReader;
import com.musala.edu.introduction.four.words.factory.SingleWordFactory;

public class Application {

	public static void main(String[] args) {
		new Hangman(new SingleWordFactory(), new HangmanConsoleReader()).play();
	}
}
