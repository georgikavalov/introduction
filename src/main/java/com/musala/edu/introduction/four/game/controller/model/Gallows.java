package com.musala.edu.introduction.four.game.controller.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gallows {

	private static final Logger CONSOLE = LoggerFactory.getLogger(Gallows.class);
	private int missesCount;

	public Gallows() {
		this.missesCount = 0;
	}

	/**
	 * Adds a body part by updating internal misses counter by logging in the
	 * console.
	 */
	public void update() {
		if (!exceedsAllowedMisses()) {
			CONSOLE.info("The {} has been added", MissesParts.values()[missesCount++]);
		} else {
			CONSOLE.info("You have been hung.");
		}
	}

	/**
	 * Checks if player is hung and logs in the console.
	 * 
	 * @return A boolean flag indicating if the player has lost the game or not.
	 */
	public boolean isHung() {
		boolean retVal = exceedsAllowedMisses();
		if (retVal) {
			CONSOLE.info("You lost :(");
		}
		return retVal;
	}

	/**
	 * Checks if the player has exceeded the allowed misses
	 * 
	 * @return A boolean flag indicating if allowed misses count has been exceeded.
	 */
	private boolean exceedsAllowedMisses() {
		return missesCount >= MissesParts.values().length;
	}

	public int getCount() {
		return missesCount;
	}
}