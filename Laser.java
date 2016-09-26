package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Laser extends Unit { 
	
	/**
	 * 
	 */
	private static final UnitType LASER = null;

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
		secondMovement = 0;
	}

	@Override
	/**
	 * 
	 */
	public void setDice(int dice) {
		dice = 10;
	}

	@Override
	/**
	 * 
	 */
	public void setType(UnitType type) {
		type = LASER;
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
		unitName = "Laser";
	}	
}
