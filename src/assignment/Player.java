package assignment;

import java.util.ArrayList;
import java.util.List;


public class Player {
	
	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}	
	
	
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flipTopCard() {
		Card cardOnTop = hand.get(0);
		hand.remove(0);
		return cardOnTop;
	}
	
	
	public int checkValue(Card cardOnTop) {
		return cardOnTop.getValue();
	}
	
	public void incrementScore(){
		this.score += 1;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}