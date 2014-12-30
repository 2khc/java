package player;

import java.util.List;

import deckofcards.ICard;

public interface IHand {
	void addCard(ICard card);

	void removeCard(ICard card);

	List<ICard> getCardsInHand();
}
