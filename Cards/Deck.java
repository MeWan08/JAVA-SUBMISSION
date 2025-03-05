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
	public void displayDeck(){
		for(Cards card:deck){
			System.out.println(card);	
		}

		System.out.println("The current deck size is "+deck.size());
	}
	// class to work on collections like arrays, hash, arraylists, etc.
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	public void randomCards(){
		shuffleDeck();
		Cards first = deck.get(0);
		Cards second = deck.get(1);
		System.out.println(first);
		System.out.println(second);
		deck.remove(first);
		deck.remove(second);
		System.out.println("The current deck size is "+deck.size());
		
	}
	public void random5Cards(){
		shuffleDeck();
		for(int i=0; i<5; i++){
			Cards card = deck.get(i);
			System.out.println(card);
			deck.remove(card);
		}
		System.out.println("The current deck size is "+deck.size());
	}
	public void showCard(){
		Cards card = deck.get(0);
		System.out.println(card);
	}
	
}