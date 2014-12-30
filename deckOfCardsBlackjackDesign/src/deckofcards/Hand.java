package deckofcards;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<ICard> hand;

	public Hand() {
		this.hand = new ArrayList<ICard>();
	}

	public void addCard(ICard card) {
		this.hand.add(card);
	}

	public void removeCard(ICard card) {
		this.hand.remove(card);
	}
	
	public List<ICard> getCardsInHand() {
		return this.hand;
	}		
}
