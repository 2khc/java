package deckofcards;

public class Card implements ICard {
	private Suit suit;
	private CardNumber number;

	public Card(CardNumber number, Suit suit) {
		this.suit = suit;
		this.number = number;
	}
	
	public Suit getCardSuit() {
		return this.suit;
	}
	
	public CardNumber getCardNumber() {
		return this.number;
	}
}
