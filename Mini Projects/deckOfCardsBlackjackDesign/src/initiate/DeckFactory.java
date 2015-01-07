package initiate;

import deckofcards.Card;
import deckofcards.CardNumber;
import deckofcards.Deck;
import deckofcards.ICard;
import deckofcards.IDeck;
import deckofcards.Suit;

public class DeckFactory implements IDeckFactory {

	public IDeck newInstance() {
		IDeck deck = new Deck();
		ICard card;

		card = new Card(CardNumber.TWO, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.THREE, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.FOUR, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.FIVE, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.SIX, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.SEVEN, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.EIGHT, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.NINE, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.TEN, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.JACK, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.QUEEN, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.KING, Suit.DIAMONDS);
		deck.addCard(card);
		card = new Card(CardNumber.ACE, Suit.DIAMONDS);
		deck.addCard(card);
		
		card = new Card(CardNumber.TWO, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.THREE, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.FOUR, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.FIVE, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.SIX, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.SEVEN, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.EIGHT, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.NINE, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.TEN, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.JACK, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.QUEEN, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.KING, Suit.CLUBS);
		deck.addCard(card);
		card = new Card(CardNumber.ACE, Suit.CLUBS);
		deck.addCard(card);
		
		card = new Card(CardNumber.TWO, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.THREE, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.FOUR, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.FIVE, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.SIX, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.SEVEN, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.EIGHT, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.NINE, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.TEN, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.JACK, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.QUEEN, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.KING, Suit.HEARTS);
		deck.addCard(card);
		card = new Card(CardNumber.ACE, Suit.HEARTS);
		deck.addCard(card);
		
		card = new Card(CardNumber.TWO, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.THREE, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.FOUR, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.FIVE, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.SIX, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.SEVEN, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.EIGHT, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.NINE, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.TEN, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.JACK, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.QUEEN, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.KING, Suit.SPADES);
		deck.addCard(card);
		card = new Card(CardNumber.ACE, Suit.SPADES);
		deck.addCard(card);
		
		return deck;
	}
}
