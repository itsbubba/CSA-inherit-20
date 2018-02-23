//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jaden Taylor 
//Date - 2/21/2017
//Class - 3rd Period
//Lab  - Inheritence

import static java.lang.System.*;

public class DeckRunner
{
	public static void main( String args[] )
	{
		Deck test = new Deck();
		
		System.out.println( "All cards in order." );
		for( int j = 1; j <= 52; j++ )
		{
			System.out.println( test.dealCard() );
		}
		
		test.shuffle();	
		
		System.out.println( "\n\nAll cards after shuffling." );
		for( int j = 1; j <= 52; j++ )
		{
			System.out.println( test.dealCard() );
		}				
	}
}