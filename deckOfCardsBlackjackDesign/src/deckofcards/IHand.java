package deckofcards;

import java.util.List;

public interface IHand {
	void addCard(ICard card);

	void removeCard(ICard card);

	List<ICard> getCardsInHand();
}
