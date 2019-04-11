public class Card {
	private String suit;
	private String rank; //changed "values" to "rank"
	
	public Card(String r, String s) {
		suit = s;
		rank = r;
	}
	
	public void display() {
		System.out.println(rank + "  " + suit); //changed print to "rank"
	}
}
