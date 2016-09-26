package edu.gvsu.cis350;

import java.util.Random;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Dice {
	/**
	 * 
	 */
	private Random random = new Random();
	/**
	 * 
	 */
	private int result;

	/**
	 * 
	 * @return hi
	 */
	public final int getResult() {
		int dice = Unit.getDice();
		result = random.nextInt(dice) + 1;
		return result;
	}

	/**
	 * 
	 * @param resultTemp hi
	 */
	public final void setResult(final int resultTemp) {
		this.result = resultTemp;
	}
	
}
