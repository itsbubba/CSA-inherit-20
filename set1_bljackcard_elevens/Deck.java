//� A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/21/2017
//Class - 3rd Period
//Lab  - Inheritence

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck
{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	
	private List<Card> cards;
	private int top;

    //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	//loop through all suits
   	//loop through all faces 1 to 13
   	//add a new BlackJack Card to the deck

   	public Deck() 
   {
    	cards = new ArrayList<Card>();
    	top = NUMCARDS - 1;
    	
    	for(String suit : SUITS)
    	{
    		
    		for(int j = 1; j < 14; j++)
    		{
    			cards.add(new BlackJackCard(suit, j));
    		}
    	}
   }
   //make a dealCard() method that returns the top card
      public Card dealCard()
   {
   	
   		return cards.get(top--);
   }
    
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
   public void shuffle()
   {
   		Collections.shuffle(cards);
   		top = NUMCARDS - 1;
   		
   }
    
}
