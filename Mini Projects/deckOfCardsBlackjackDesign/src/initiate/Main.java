package initiate;

import player.Dealer;
import player.IDealer;
import player.IPlayer;
import player.Player;
import deckofcards.IDeck;


public class Main {
	public static void initialiseBlackJack() {
		IDeckFactory deckFactory = new DeckFactory();
		IDeck deck = deckFactory.newInstance();
		
		IDealer dealer = new Dealer("Dolan");
		dealer.shuffleDeck(deck);
		IPlayer player = new Player(1);
		player.fold();
		dealer.dealHands(deck, 1);
		
	}
}
