package deckofcards;

public interface IDeck {
	void addCard(ICard card);
	ICard draw();
	int getDeckSize();
	int getCurrentSize();
}
