package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class MobileUnit extends Unit {
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
	public void setDice(int dice) {
		dice = 6;
	}

	/**
	 * 
	 */
	public void setType(UnitType type) {
		type = MECHANIZED;
	}
	
	/**
	 * 
	 */
	public void setNumber(int[] number) {
	}

	/**
	 * @param hi
	 */
	public void setUnitName(String unitName) {
		unitName = "Mobile Unit";
	}	
}
