package edu.gvsu.cis350;

/**
 * 
 * @author Hofstee Laptop
 *
 */
public class PartisanCard {
	/**
	 * 
	 */
	private static final int NUMCARDS = 30;
	/**
	 * 
	 */
	private int[] cards = new int[NUMCARDS];
	/**
	 * 
	 */
	private int[] usedCards = new int[NUMCARDS - 1];
	/**
	 * 
	 */
	private int[] deck = new int[NUMCARDS];

	/**
	 * 
	 */
	public void drawCard() {
	}
	
	/**
	 * 
	 */
	public void shuffleDeck() {
		
	}
	/**
	 * 
	 * @return cards
	 */
	public int[] getCards() {
		return cards;
	}

	/**
	 * 
	 * @param cards hi
	 */
	public void setCards(int[] cards) {
		this.cards = cards;
	}

	/**
	 * 
	 * @return hi
	 */
	public int[] getUsedCards() {
		return usedCards;
	}

	/**
	 * 
	 * @param usedCards hi
	 */
	public void setUsedCards(int[] usedCards) {
		this.usedCards = usedCards;
	}

	/**
	 * 
	 * @return hi
	 */
	public int[] getDeck() {
		return deck;
	}

	/**
	 * 
	 * @param deck
	 */
	public void setDeck(int[] deck) {
		this.deck = deck;
	}
}
