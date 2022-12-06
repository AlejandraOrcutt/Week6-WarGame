package assignment;

public class App {	
	
	public static void main(String[] args) {
		
		System.out.println("Are you ready for War?!");
		System.out.println();
		System.out.println("Take turns drawing the cards. each p;ayer will have 26. Both player show set down one card at the same time. The one wiht the higher card takes both. Win the game by having the highest score");
		
		Deck deck = new Deck();	
		Player player1 = new Player("Player 1");		
		Player player2 = new Player("Player 2");
		
		deck.shuffle();		
		deck.createPlayersHands(deck, player1, player2);
		
		System.out.println();
		System.out.println("*** The deck of cards has been shuffled ***");
		System.out.println();
		System.out.println(" Game is on!!!");
		System.out.println();
		
		
		while (!player1.hand.isEmpty() || !player2.hand.isEmpty()){
			for (int i = 0; i < 26; i++) {
				System.out.println();
				Card card1 = player1.flipTopCard();
				System.out.print("Player 1 flipped a(n) "); card1.describe();
				Card card2 = player2.flipTopCard();
				System.out.print("Player 2 flipped a(n) "); card2.describe();
				
				if (player1.checkValue(card1)> player2.checkValue(card2)) {
					player1.incrementScore();
					System.out.println("Player 1 beats all the odds! WOOOOW!!!");
					System.out.println("Player 1 is on the lead with " + player1.getScore()+ " making Player 2 sad with " + player2.getScore() + ".");

				} else if (player1.checkValue(card1)< player2.checkValue(card2)) {
					player2.incrementScore();
					System.out.println("Player 2 os on the lead with " + player2.getScore()+ " surpassing Player 1 with " + player1.getScore() + ".");
					
				} else {}
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("    * * * * * Final score * * * * *");
		System.out.println();
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1: " + player1.getScore() + " battles.");
			System.out.println("Player 2: " + player2.getScore() + " battles.");
			System.out.println();
			System.out.println("Player 1 wins the war!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 1: " + player1.getScore() + " battles.");
			System.out.println("Player 2: " + player2.getScore() + " battles.");
			System.out.println();
			System.out.println("Player 2 wins the war!");
		} else {
			System.out.println("Player 1: " + player1.getScore() + " battles.");
			System.out.println("Player 2: " + player2.getScore() + " battles.");
			System.out.println();
			System.out.println("No winners today... we have a draw!");
		}
		
		System.out.println();
		System.out.println("--- This is all folks! Good bye! ---");
		
	}
	
}
	