// Deck.java
import java.util.*;
class Deck{
	ArrayList<Cards> deck;
	// to create the deck
	public Deck(){
		this.deck = new ArrayList<>();
	} 
	// to populate the deck
	public void createDeck(){
		String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suitsBlack = {"Spades", "Clubs"};
		String[] suitsRed = {"Hearts", "Diamonds"};
		String[] colours = {"Red", "Black"};
		
		for(String colour:colours){
			if(colour == "Red"){
				for(String rank:ranks){
					for(String suit:suitsRed){
						deck.add(new Cards(rank, suit, colour));
							
					}
				}
			}
			else{
				for(String rank:ranks){
					for(String suit:suitsBlack){
						deck.add(new Cards(rank, suit, colour));
						
					}
				}
			}
		}
		System.out.println("The count of the deck is:" + deck.size());
	}
}