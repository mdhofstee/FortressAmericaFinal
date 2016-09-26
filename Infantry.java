package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Infantry extends Unit {

	/**
	 * 
	 */
	private static final UnitType INFANTRY = null;

	@Override
	/**
	 * 
	 */
	public void setFirstMovement(int firstMovement) {
		firstMovement = 0;
	}

	@Override
	/**
	 * 
	 */
	public void setSecondMovement(int secondMovement) {
		secondMovement = 1;
	}

	@Override
	/**
	 * 
	 */
	public void setDice(int dice) {
		dice = 6;
	}

	@Override
	/**
	 * 
	 */
	public void setType(UnitType type) {
		type = INFANTRY;
	}

	@Override
	/**
	 * 
	 */
	public void setNumber(int[] number) {
	}

	@Override
	/**
	 * 
	 */
	public void setUnitName(String unitName) {
		unitName = "Infantry";
	}	
}
