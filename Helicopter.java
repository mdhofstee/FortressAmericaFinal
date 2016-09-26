package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Helicopter extends Unit {
	/**
	 * 
	 */
	private static final UnitType AIR = null;

	@Override
	/**
	 * 
	 */
	public void setFirstMovement(int firstMovement) {
		firstMovement = 2;
	}

	@Override
	/**
	 * 
	 */
	public void setSecondMovement(int secondMovement) {
		secondMovement = 2;
	}

	@Override
	/**
	 * 
	 */
	public void setDice(int dice) {
		dice = 8;
	}

	@Override
	/**
	 * 
	 */
	public void setType(UnitType type) {
		type = AIR;
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
		unitName = "Helicopter";
	}	
}
