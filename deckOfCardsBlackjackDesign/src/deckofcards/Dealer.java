package deckofcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer implements IDealer {
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

	public List<Hand> dealHands(Deck deck, int numberOfPlayers) {
		List<Hand> hands = new ArrayList<Hand>();

		for (int i = 0; i < numberOfPlayers; i++) {
			Hand hand = new Hand();
			hands.add(i, hand);
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < hands.size(); j++) {
				ICard drawnCard = deck.draw();
				hands.get(j).addCard(drawnCard);
			}
		}
		return hands;
	}

}
