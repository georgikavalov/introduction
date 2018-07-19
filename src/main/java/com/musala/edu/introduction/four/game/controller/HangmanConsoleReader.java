package com.musala.edu.introduction.four.game.controller;

import java.io.InputStream;
import java.util.Scanner;

public class HangmanConsoleReader {
	private static final String QUIT = "quit";
	private Scanner scanner;
	private String nextLetter;

	public HangmanConsoleReader() {
		this.scanner = new Scanner(System.in);
	}

	public HangmanConsoleReader(InputStream stream) {
		this.scanner = new Scanner(stream);
	}

	/**
	 * Takes user input through the specified scanner
	 * 
	 * @return
	 */
	public boolean takeUserInput() {
		String userInput = scanner.nextLine();
		if (!userInput.equalsIgnoreCase(QUIT)) {
			nextLetter = userInput;
			return true;
		} else {
			nextLetter = "";
			return false;
		}
	}

	/**
	 * Closes the scanner object.
	 */
	public void closeReader() {
		scanner.close();
	}

	public String getNextLetter() {
		return nextLetter;
	}
}
