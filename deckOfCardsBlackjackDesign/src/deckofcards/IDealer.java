package deckofcards;

import java.util.List;

public interface IDealer {
	void shuffleDeck(Deck deck);

	List<Hand> dealHands(Deck deck, int numberOfPlayers);
}
