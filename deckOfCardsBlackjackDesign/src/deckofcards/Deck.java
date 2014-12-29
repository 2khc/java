package deckofcards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private final int NUMBER_OF_CARDS;
	private List<ICard> cards;

	public Deck() {
		NUMBER_OF_CARDS = 52;
		this.cards = new ArrayList<ICard>();
	}

	public void addCard(ICard card) {
		this.cards.add(card);
	}

	// let beginning of List be top of deck
	public ICard draw() {
		ICard cardDrawn = this.cards.get(this.cards.size() - 1);
		this.cards.remove(this.cards.size() - 1);
		return cardDrawn;
	}
	
	public int getDeckSize(){
		return NUMBER_OF_CARDS;
	}

	public int getCurrentSize(){
		return cards.size();
	}
}
