package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	/*
	 * Fields (arrays used to build each card)
	 */
	List<Integer> values = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);  //all possible mathematical values in the deck
	List<String> suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");  //all possible suits
	List<Card> deckOfCards = new ArrayList<Card>();
	
	
	/*
	 * Constructor
	 */
	public Deck() {
		for(int value : values) {
			for(String suit : suits) {
				Card card = new Card(value, suit);
				this.deckOfCards.add(card);
			}
		}		
	}	
	
	public void createPlayersHands(Deck deck, Player player1, Player player2) {
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
	}
		
	public Card draw() {
		Card cardOnTop = deckOfCards.get(0);
		deckOfCards.remove(0);
		return cardOnTop;
	}
	
	/*
	 * Public methods
	 */
	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}
	

	


}
	
