//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;

public class BlockTestTwo extends Canvas
{
	public BlockTestTwo()
	{
		setBackground(Color.BLACK);
		
	}

	public void paint(Graphics window)
	{
		//add more test cases
		
		Block one = new Block();
		one.draw(window);

		Block two = new Block(50,50,30,30);
		two.draw(window);

		Block three = new Block(350,350,15,15,Color.RED);
		three.draw(window);

		two.draw(window, Color.BLACK);

		Block four = new Block(450,50,20,60, Color.RED);
		four.draw(window);
			
	}
}