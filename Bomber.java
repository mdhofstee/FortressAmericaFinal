package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Bomber extends Unit {
	
	/**
	 * 
	 */
	private static final UnitType AIR = null;
	/**
	 * 
	 */
	static final int MOVE = 4;
	/**
	 * 
	 */
	@Override
	public final void setFirstMovement(int firstMovement) {
		firstMovement = 4;
	}

	@Override
	/**
	 * 
	 */
	public void setSecondMovement(int secondMovement) {
		secondMovement = 4;
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
		unitName = "Bomber";
	}	
}
