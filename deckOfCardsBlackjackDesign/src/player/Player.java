package player;

import deckofcards.IDeck;

public class Player implements IPlayer {

	private int playerNumber;
	private IHand hand;
	private int bet;

	public Player(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public int getPlayerNumber() {
		return this.playerNumber;
	}

	public void setPlayerNumber(int num) {
		this.playerNumber = num;
	}

	public void setHand(IHand hand) {
		this.hand = hand;
	}

	public void raiseBet() {
		this.bet = +10;
	}

	public void hit(IDeck deck) {
		this.hand.addCard(deck.draw());
	}

	public void fold() {
		this.hand = null;
	}

	// public void split() {
	// // code to check if 2 cards in the hand have the same number, if so split
	// into 2 hands.
	// }
}
