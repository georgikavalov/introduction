package com.musala.edu.introduction.four.game.controller;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HangmanConsoleReader {
	private static final Logger CONSOLE = LoggerFactory.getLogger(HangmanConsoleReader.class);
	private static final String QUIT = "quit";
	private Scanner scanner;
	private String userInput;

	public HangmanConsoleReader() {
		this.scanner = new Scanner(System.in);
	}

	public HangmanConsoleReader(String[] input) {
		StringBuilder inputLetters = new StringBuilder();
		for (String letter : input) {
			inputLetters.append(letter + "\n");
		}
		this.scanner = new Scanner(new ByteArrayInputStream(inputLetters.toString().getBytes()));
	}

	/**
	 * Takes user input through the specified scanner
	 * 
	 * @return
	 */
	public boolean takeUserInput() {
		CONSOLE.info("Guess a letter:");
		userInput = scanner.nextLine();
		boolean retVal = !userInput.equalsIgnoreCase(QUIT);
		if (!retVal) {
			CONSOLE.info("You have quit that game.");
		}
		return retVal;
	}

	/**
	 * Closes the scanner object.
	 */
	public void closeReader() {
		scanner.close();
	}

	public String getUserInput() {
		return userInput;
	}
}
