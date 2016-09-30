package edu.gvsu.cis350;
/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Territory {
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String[] borders;
	/**
	 * 
	 */
	private String[] units;
	/**
	 * 
	 */
	private String[] modifiers;
	
	/**
	 * 
	 * @return hi
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param tempName hi
	 */
	public void setName(String tempName) {
		this.name = tempName;
	}
	
	/**
	 * 
	 * @return hi
	 */
	public String[] getBorders() {
		return borders;
	}
	public void setBorders(String[] borders) {
		this.borders = borders;
	}
	public String[] getUnits() {
		return units;
	}
	public void setUnits(String[] units) {
		this.units = units;
	}
	public String[] getModifiers() {
		return modifiers;
	}
	public void setModifiers(String[] modifiers) {
		this.modifiers = modifiers;
	}
}
