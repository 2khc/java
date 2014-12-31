package player;

import deckofcards.IDeck;

public interface IPlayer {
	int getPlayerNumber();

	void setPlayerNumber(int num);

	void setHand(IHand hand);

	void raiseBet();

	void hit(IDeck deck);

	void fold();

	int getBet();
}
