package com.musala.edu.introduction.four.game.controller.model;

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
	 * @return A boolean flag indicating if user kept playing or not
	 */
	public boolean takeUserInput() {
		CONSOLE.info("Guess a letter:");
		userInput = scanner.nextLine().trim().toLowerCase();
		boolean retVal = !userInput.equalsIgnoreCase(QUIT);
		if (!retVal) {
			CONSOLE.info("You have quit the game.");
			userInput = "";
		} else {
			if (userInput.length() > 1) {
				CONSOLE.info("You have entered more than one character. \'{}\' will be truncated to \'{}\'", userInput,
						userInput.charAt(0));
				userInput = Character.toString(userInput.charAt(0));
			} else if (userInput.length() == 0) {
				userInput = "\n";
			}
			CONSOLE.info("You have guessed: {}", userInput);
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
