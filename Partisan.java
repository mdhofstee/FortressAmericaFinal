package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Partisan extends Unit {

	/**
	 * 
	 */
	private static final UnitType INFANTRY = null;

	/**
	 * 
	 * @param firstMovement hi
	 */
	@Override
	public final void setFirstMovement(int firstMovement) {
		firstMovement = 0;
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
		// if territory has unit != partisan dice = 6 else dice = 8
		dice = 6;
	}

	/**
	 * 
	 */
	public void setType(UnitType type) {
		type = INFANTRY;
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
		unitName = "Partisan";
	}	
	
}
