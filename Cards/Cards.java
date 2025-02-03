// Cards.java

class Cards{
	String suit;
	String rank;
	String colour;

	public Cards(String rank, String suit, String colour){
		this.rank = rank;
		this.suit = suit;
		this.colour = colour;
	}
	public String toString(){
		return colour+ " " +rank + " of "+ suit;
	}
	
}