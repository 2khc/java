package deckofcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {
	private String name;

	public Dealer(String name) {
		this.name = name;
	}

	public void shuffleDeck(Deck deck) {
		List<ICard> cardArrayList = new ArrayList<ICard>();

		for (int i = 0; i < deck.getDeckSize(); i++) {
			Random r = new Random();
			cardArrayList.add(r.nextInt(deck.getCurrentSize()), deck.draw());
		}

		for (int i = 0; i < deck.getDeckSize(); i++) {
			deck.addCard(cardArrayList.get(i));
		}
	}

	public void dealHands(Deck deck, int numberOfPlayers) {
		List<Hand> hands = new ArrayList<Hand>();
		
		for (int i=0;i<numberOfPlayers;i++){
			Hand hand = new Hand();
			hands.add(i, hand);
		}
		
		for (int i = 0; i < hands.size(); i++) {
			hands.get(i).addCard();
		}
	}

}
