package player;

import java.util.List;

import deckofcards.IDeck;

public interface IDealer {
	void shuffleDeck(IDeck deck);

	List<Hand> dealHands(IDeck deck, int numberOfPlayers);
}
