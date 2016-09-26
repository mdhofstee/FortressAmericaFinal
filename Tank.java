package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Tank extends Unit {
	/**
	 * 
	 */
	static final int DICE = 8;
	/**
	 * 
	 */
	private static final UnitType MECHANIZED = null;

	/**
	 * 
	 */
	public void setFirstMovement(int firstMovement) {
		firstMovement = 1;
	}

	/**
	 * 
	 */
	public void setSecondMovement(int secondMovement) {
		secondMovement = 1;
	}

	/**
	 * 
	 */
	public final void setDice(int dice) {
		dice = DICE;
	}

	/**
	 * 
	 */
	public void setType(UnitType type) {
		type = MECHANIZED;
	}

	/**
	 *  @param hi
	 */
	public final void setUnitName(String unitName) {
		unitName = "Hover Tank";
	}	
}
