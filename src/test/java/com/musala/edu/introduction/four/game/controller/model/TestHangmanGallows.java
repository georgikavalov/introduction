package com.musala.edu.introduction.four.game.controller.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.musala.edu.introduction.four.game.controller.model.MissesParts;

/**
 * The {@code TestHangmanGallows} consists of unit tests for the {@link Gallows}
 * class
 * 
 * @author georgi.kavalov
 *
 */
public class TestHangmanGallows {

	/**
	 * Tests updating the gallows.
	 */
	@Test
	public void testUpdate() {
		Gallows gallows = new Gallows();
		assertArrayEquals(new int[] { gallows.getCount() }, new int[] { 0 });
		gallows.update();
		assertArrayEquals(new int[] { gallows.getCount() }, new int[] { 1 });
	}

	/**
	 * Tests validity of is hung correctness.
	 */
	@Test
	public void testIsHung() {
		Gallows gallows = new Gallows();
		assertFalse(gallows.isHung());

		for (int i = 0; i < MissesParts.values().length; i++) {
			gallows.update();
		}
		gallows.update();
		assertTrue(gallows.isHung());
	}
}
