package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class Game {
	/**
	 * 
	 */
	private Player west = new Player();
	/**
	 * 
	 */
	private Player south = new Player();
	/**
	 * 
	 */
	private Player east = new Player();
	/**
	 * 
	 */
	private Player us = new Player();
	
	/**
	 * The game begins.
	 */
	final void play() {
		load();
		final int cityMax = 30;
		final int cityMin = 12;
		int city = cityMax;
		while (city > cityMin) {
			turn();
			city = CheckCity();
		}
	}
	
	/**
	 * 
	 */
	public final void turn() {
		west.Reinforcement();
		west.Declare();
		west.FirstMovement();
		west.Combat();
		west.SecondMovement();
		west.SupplyCheck();
		west.Capture();
		south.Reinforcement();
		south.Declare();
		south.FirstMovement();
		south.Combat();
		south.SecondMovement();
		south.SupplyCheck();
		south.Capture();
		east.Reinforcement();
		east.Declare();
		east.FirstMovement();
		east.Combat();
		east.SecondMovement();
		east.SupplyCheck();
		east.Capture();
		us.PartisanCard();
		us.Laser();
		us.DeclareLaser();
		us.Declare();
		us.FirstMovement();
		us.LaserCombat();
		us.Combat();
		us.SecondMovement();
		us.CityCapture();
		us.Capture();		
	}
	
	/**
	 * 
	 * @return int of the number of cities.
	 */
	private int CheckCity() {
		// 
		return 0;
	}

	/**
	 * Loads the game.
	 */
	public final void load() {
		unitInfantryLoad();
		unitMobileUnitLoad();
		unitTankLoad();
		unitHelicopterLoad();
		unitBomberLoad();
		unitLaserLoad();
		
	}
	
	/**
	 * Loads all 24 infantry units for each player.
	 */
	public final void unitInfantryLoad() {
		// Western Infantry
		Infantry westInfantry01 = new Infantry();
		Infantry westInfantry02 = new Infantry();
		Infantry westInfantry03 = new Infantry();
		Infantry westInfantry04 = new Infantry();
		Infantry westInfantry05 = new Infantry();
		Infantry westInfantry06 = new Infantry();
		Infantry westInfantry07 = new Infantry();
		Infantry westInfantry08 = new Infantry();
		Infantry westInfantry09 = new Infantry();
		Infantry westInfantry10 = new Infantry();
		Infantry westInfantry11 = new Infantry();
		Infantry westInfantry12 = new Infantry();
		Infantry westInfantry13 = new Infantry();
		Infantry westInfantry14 = new Infantry();
		Infantry westInfantry15 = new Infantry();
		Infantry westInfantry16 = new Infantry();
		Infantry westInfantry17 = new Infantry();
		Infantry westInfantry18 = new Infantry();
		Infantry westInfantry19 = new Infantry();
		Infantry westInfantry20 = new Infantry();
		Infantry westInfantry21 = new Infantry();
		Infantry westInfantry22 = new Infantry();
		Infantry westInfantry23 = new Infantry();
		Infantry westInfantry24 = new Infantry();
		// Southern Infantry
		Infantry southInfantry01 = new Infantry();
		Infantry southInfantry02 = new Infantry();
		Infantry southInfantry03 = new Infantry();
		Infantry southInfantry04 = new Infantry();
		Infantry southInfantry05 = new Infantry();
		Infantry southInfantry06 = new Infantry();
		Infantry southInfantry07 = new Infantry();
		Infantry southInfantry08 = new Infantry();
		Infantry southInfantry09 = new Infantry();
		Infantry southInfantry10 = new Infantry();
		Infantry southInfantry11 = new Infantry();
		Infantry southInfantry12 = new Infantry();
		Infantry southInfantry13 = new Infantry();
		Infantry southInfantry14 = new Infantry();
		Infantry southInfantry15 = new Infantry();
		Infantry southInfantry16 = new Infantry();
		Infantry southInfantry17 = new Infantry();
		Infantry southInfantry18 = new Infantry();
		Infantry southInfantry19 = new Infantry();
		Infantry southInfantry20 = new Infantry();
		Infantry southInfantry21 = new Infantry();
		Infantry southInfantry22 = new Infantry();
		Infantry southInfantry23 = new Infantry();
		Infantry southInfantry24 = new Infantry();
		// Eastern Infantry
		Infantry eastInfantry01 = new Infantry();
		Infantry eastInfantry02 = new Infantry();
		Infantry eastInfantry03 = new Infantry();
		Infantry eastInfantry04 = new Infantry();
		Infantry eastInfantry05 = new Infantry();
		Infantry eastInfantry06 = new Infantry();
		Infantry eastInfantry07 = new Infantry();
		Infantry eastInfantry08 = new Infantry();
		Infantry eastInfantry09 = new Infantry();
		Infantry eastInfantry10 = new Infantry();
		Infantry eastInfantry11 = new Infantry();
		Infantry eastInfantry12 = new Infantry();
		Infantry eastInfantry13 = new Infantry();
		Infantry eastInfantry14 = new Infantry();
		Infantry eastInfantry15 = new Infantry();
		Infantry eastInfantry16 = new Infantry();
		Infantry eastInfantry17 = new Infantry();
		Infantry eastInfantry18 = new Infantry();
		Infantry eastInfantry19 = new Infantry();
		Infantry eastInfantry20 = new Infantry();
		Infantry eastInfantry21 = new Infantry();
		Infantry eastInfantry22 = new Infantry();
		Infantry eastInfantry23 = new Infantry();
		Infantry eastInfantry24 = new Infantry();
		
		// US Infantry
		Infantry usInfantry01 = new Infantry();
		Infantry usInfantry02 = new Infantry();
		Infantry usInfantry03 = new Infantry();
		Infantry usInfantry04 = new Infantry();
		Infantry usInfantry05 = new Infantry();
		Infantry usInfantry06 = new Infantry();
		Infantry usInfantry07 = new Infantry();
		Infantry usInfantry08 = new Infantry();
		Infantry usInfantry09 = new Infantry();
		Infantry usInfantry10 = new Infantry();
		Infantry usInfantry11 = new Infantry();
		Infantry usInfantry12 = new Infantry();
		Infantry usInfantry13 = new Infantry();
		Infantry usInfantry14 = new Infantry();
		Infantry usInfantry15 = new Infantry();
		Infantry usInfantry16 = new Infantry();
		Infantry usInfantry17 = new Infantry();
		Infantry usInfantry18 = new Infantry();
		Infantry usInfantry19 = new Infantry();
		Infantry usInfantry20 = new Infantry();
		Infantry usInfantry21 = new Infantry();
		Infantry usInfantry22 = new Infantry();
		Infantry usInfantry23 = new Infantry();
		Infantry usInfantry24 = new Infantry();
	}
	/**
	 * Loads all of starting units for Mobile Units.
	 */
	public final void unitMobileUnitLoad() {
		// West Mobile Unit
		MobileUnit westMobileUnit1 = new MobileUnit();
		MobileUnit westMobileUnit2 = new MobileUnit();
		MobileUnit westMobileUnit3 = new MobileUnit();
		MobileUnit westMobileUnit4 = new MobileUnit();
		MobileUnit westMobileUnit5 = new MobileUnit();
		MobileUnit westMobileUnit6 = new MobileUnit();
		MobileUnit westMobileUnit7 = new MobileUnit();
		MobileUnit westMobileUnit8 = new MobileUnit();
		MobileUnit westMobileUnit9 = new MobileUnit();
		//South Mobile Unit
		MobileUnit southMobileUnit1 = new MobileUnit();
		MobileUnit southMobileUnit2 = new MobileUnit();
		MobileUnit southMobileUnit3 = new MobileUnit();
		MobileUnit southMobileUnit4 = new MobileUnit();
		MobileUnit southMobileUnit5 = new MobileUnit();
		MobileUnit southMobileUnit6 = new MobileUnit();
		MobileUnit southMobileUnit7 = new MobileUnit();
		MobileUnit southMobileUnit8 = new MobileUnit();
		MobileUnit southMobileUnit9 = new MobileUnit();
		//East Modile Unit
		MobileUnit eastMobileUnit1 = new MobileUnit();
		MobileUnit eastMobileUnit2 = new MobileUnit();
		MobileUnit eastMobileUnit3 = new MobileUnit();
		MobileUnit eastMobileUnit4 = new MobileUnit();
		MobileUnit eastMobileUnit5 = new MobileUnit();
		MobileUnit eastMobileUnit6 = new MobileUnit();
		MobileUnit eastMobileUnit7 = new MobileUnit();
		MobileUnit eastMobileUnit8 = new MobileUnit();
		MobileUnit eastMobileUnit9 = new MobileUnit();
		//US modileUnit
		MobileUnit usMobileUnit1 = new MobileUnit();
		MobileUnit usMobileUnit2 = new MobileUnit();
		MobileUnit usMobileUnit3 = new MobileUnit();
		MobileUnit usMobileUnit4 = new MobileUnit();
		MobileUnit usMobileUnit5 = new MobileUnit();
		MobileUnit usMobileUnit6 = new MobileUnit();
		MobileUnit usMobileUnit7 = new MobileUnit();
		MobileUnit usMobileUnit8 = new MobileUnit();
		MobileUnit usMobileUnit9 = new MobileUnit();	
	}
	
	/**
	 * Loads all of the starting tank units.
	 */
	public final void unitTankLoad() {
		// West Tanks
		Tank westTank01 = new Tank();
		Tank westTank02 = new Tank();
		Tank westTank03 = new Tank();
		Tank westTank04 = new Tank();
		Tank westTank05 = new Tank();
		Tank westTank06 = new Tank();
		Tank westTank07 = new Tank();
		Tank westTank08 = new Tank();
		Tank westTank09 = new Tank();
		Tank westTank10 = new Tank();
		Tank westTank11 = new Tank();
		Tank westTank12 = new Tank();
		// South Tanks
		Tank southTank01 = new Tank();
		Tank southTank02 = new Tank();
		Tank southTank03 = new Tank();
		Tank southTank04 = new Tank();
		Tank southTank05 = new Tank();
		Tank southTank06 = new Tank();
		Tank southTank07 = new Tank();
		Tank southTank08 = new Tank();
		Tank southTank09 = new Tank();
		Tank southTank10 = new Tank();
		Tank southTank11 = new Tank();
		Tank southTank12 = new Tank();
		// East Tanks
		Tank eastTank01 = new Tank();
		Tank eastTank02 = new Tank();
		Tank eastTank03 = new Tank();
		Tank eastTank04 = new Tank();
		Tank eastTank05 = new Tank();
		Tank eastTank06 = new Tank();
		Tank eastTank07 = new Tank();
		Tank eastTank08 = new Tank();
		Tank eastTank09 = new Tank();
		Tank eastTank10 = new Tank();
		Tank eastTank11 = new Tank();
		Tank eastTank12 = new Tank();
		// US Tanks
		Tank usTank01 = new Tank();
		Tank usTank02 = new Tank();
		Tank usTank03 = new Tank();
		Tank usTank04 = new Tank();
		Tank usTank05 = new Tank();
		Tank usTank06 = new Tank();
		Tank usTank07 = new Tank();
		Tank usTank08 = new Tank();
		Tank usTank09 = new Tank();
		Tank usTank10 = new Tank();
		Tank usTank11 = new Tank();
		Tank usTank12 = new Tank();
	}
	
	/**
	 * Loads all of helicopter units.
	 */
	public final void unitHelicopterLoad() {
		// West Helicopter
		Helicopter westHelicopter1 = new Helicopter();
		Helicopter westHelicopter2 = new Helicopter();
		Helicopter westHelicopter3 = new Helicopter();
		Helicopter westHelicopter4 = new Helicopter();
		Helicopter westHelicopter5 = new Helicopter();
		Helicopter westHelicopter6 = new Helicopter();
		Helicopter westHelicopter7 = new Helicopter();
		Helicopter westHelicopter8 = new Helicopter();
		Helicopter westHelicopter9 = new Helicopter();
		// South Helicopter
		Helicopter SouthHelicopter1 = new Helicopter();
		Helicopter SouthHelicopter2 = new Helicopter();
		Helicopter SouthHelicopter3 = new Helicopter();
		Helicopter SouthHelicopter4 = new Helicopter();
		Helicopter SouthHelicopter5 = new Helicopter();
		Helicopter SouthHelicopter6 = new Helicopter();
		Helicopter SouthHelicopter7 = new Helicopter();
		Helicopter SouthHelicopter8 = new Helicopter();
		Helicopter SouthHelicopter9 = new Helicopter();
		// East Helicopter
		Helicopter EastHelicopter1 = new Helicopter();
		Helicopter EastHelicopter2 = new Helicopter();
		Helicopter EastHelicopter3 = new Helicopter();
		Helicopter EastHelicopter4 = new Helicopter();
		Helicopter EastHelicopter5 = new Helicopter();
		Helicopter EastHelicopter6 = new Helicopter();
		Helicopter EastHelicopter7 = new Helicopter();
		Helicopter EastHelicopter8 = new Helicopter();
		Helicopter EastHelicopter9 = new Helicopter();
		// US Helicopter
		Helicopter usHelicopter1 = new Helicopter();
		Helicopter usHelicopter2 = new Helicopter();
		Helicopter usHelicopter3 = new Helicopter();
		Helicopter usHelicopter4 = new Helicopter();
		Helicopter usHelicopter5 = new Helicopter();
		Helicopter usHelicopter6 = new Helicopter();
		Helicopter usHelicopter7 = new Helicopter();
		Helicopter usHelicopter8 = new Helicopter();
		Helicopter usHelicopter9 = new Helicopter();
	}
	
	/**
	 * Loads all of bomber units.
	 */
	public final void unitBomberLoad() {
		// West Bomber
		Bomber westBomber1 = new Bomber();
		Bomber westBomber2 = new Bomber();
		Bomber westBomber3 = new Bomber();
		Bomber westBomber4 = new Bomber();
		Bomber westBomber5 = new Bomber();
		Bomber westBomber6 = new Bomber();
		// South Bomber
		Bomber southBomber1 = new Bomber();
		Bomber southBomber2 = new Bomber();
		Bomber southBomber3 = new Bomber();
		Bomber southBomber4 = new Bomber();
		Bomber southBomber5 = new Bomber();
		Bomber southBomber6 = new Bomber();
		// East Bomber
		Bomber eastBomber1 = new Bomber();
		Bomber eastBomber2 = new Bomber();
		Bomber eastBomber3 = new Bomber();
		Bomber eastBomber4 = new Bomber();
		Bomber eastBomber5 = new Bomber();
		Bomber eastBomber6 = new Bomber();
		// US Bomber
		Bomber usBomber1 = new Bomber();
		Bomber usBomber2 = new Bomber();
		Bomber usBomber3 = new Bomber();
		Bomber usBomber4 = new Bomber();
		Bomber usBomber5 = new Bomber();
		Bomber usBomber6 = new Bomber();		
	}
	
	/**
	 * Loads all of the Laser units.
	 */
	private void unitLaserLoad() {
		// US lasers
		Laser laser01 = new Laser();
		Laser laser02 = new Laser();
		Laser laser03 = new Laser();
		Laser laser04 = new Laser();
		Laser laser05 = new Laser();
		Laser laser06 = new Laser();
		Laser laser07 = new Laser();
		Laser laser08 = new Laser();
		Laser laser09 = new Laser();
		Laser laser10 = new Laser();
		Laser laser11 = new Laser();
		Laser laser12 = new Laser();
	}
}
