package assignment;

public class Card {
	
	/*
	 * Card fields
	 */
	private String name;
	private int value;
	
	/*
	 * Constructor
	 */
	public Card(int value, String name) {
		this.name = name;
		this.value = value;
	}
		
	
	/*
	 * Public methods - method "describe"
	 */
	public void describe() {
		String valuesInWords = "";
		switch (this.value) {
		case 2:
			valuesInWords = "Two";
		case 3:
			valuesInWords = "Three";
		case 4:
			valuesInWords = "Four";
			break;
		case 5:
			valuesInWords = "Five";
			break;
		case 6:
			valuesInWords = "Six";
		case 7:
			valuesInWords = "Seven";
			break;
		case 8:
			valuesInWords = "Eight";
			break;
		case 9:
			valuesInWords = "Nine";
		case 10:
			valuesInWords = "Ten";
		case 11:
			valuesInWords = "Jack";
			break;
		case 12:
			valuesInWords = "Queen";
			break;
		case 13:
			valuesInWords = "King";
		case 14:
			valuesInWords = "Ace";
	}
		System.out.println(valuesInWords + " of " + this.getName());
	}
	
	/*
	 * Getters & Setters
	 */
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}
	

	
	
}
