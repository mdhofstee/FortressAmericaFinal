package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Unit {
	/**
	 * 
	 */
	protected static int firstMovement = 0;
	/**
	 * 
	 */
	protected static int secondMovement;
	/**
	 * 
	 */
	protected static int dice = 0;
	/**
	 * 
	 */
	protected static UnitType type;
	/**
	 * 
	 */
	protected static int[] number;
	/**
	 * 
	 */
	protected static String unitName;
	
	/**
	 * 
	 * @return int
	 */
	public final int getFirstMovement() {
		return firstMovement;
	}
	
	/**
	 * 
	 * @param firstMovementTemp hi
	 */
	public void setFirstMovement(final int firstMovementTemp) {
		Unit.firstMovement = firstMovementTemp;
	}
	
	/**
	 * 
	 * @return int
	 */
	public int getSecondMovement() {
		return secondMovement;
	}
	
	/**
	 * 
	 * @param secondMovementTemp hi
	 */
	public void setSecondMovement(final int secondMovementTemp) {
		Unit.secondMovement = secondMovementTemp;
	}
	
	/**
	 * 
	 * @return int
	 */
	public static int getDice() {
		return dice;
	}
	
	/**
	 * 
	 * @param diceTemp hi
	 */
	public void setDice(int diceTemp) {
		Unit.dice = diceTemp;
	}
	
	/**
	 * 
	 * @return UnitType
	 */
	public final UnitType getType() {
		return getType();
	}
	
	/**
	 * 
	 * @param typeTemp hi
	 */
	public void setType(final UnitType typeTemp) {
		Unit.type = typeTemp;
	}
	
	/**
	 * 
	 * @return int[]
	 */
	public final int[] getNumber() {
		return number;
	}
	
	/**
	 * 
	 * @param numberTemp hi
	 */
	public void setNumber(final int[] numberTemp) {
		Unit.number = numberTemp;
	}
	
	/**
	 * 
	 * @return String
	 */
	public final String getUnitName() {
		return unitName;
	}
	
	/**
	 * 
	 * @param unitNameTemp hi
	 */
	public void setUnitName(final String unitNameTemp) {
		Unit.unitName = unitNameTemp;
	}
	
}
