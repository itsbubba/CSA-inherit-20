//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date - 
//Class - 
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {
		super(x, y);
   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
		super(x, y, wid, ht);
   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
		super(x, y, wid, ht, new Color(0, 0, 0), xSpd, ySpd);
   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public Color randomColor()
   {
   		int r = (int) (Math.random() * 256);
 		int g = (int) (Math.random() * 256);
 		int b = (int) (Math.random() * 256);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
		//draw a white ball at old ball location
		
   		window.setColor(new Color(255, 255, 255));
		window.fillOval(getX(), getY(), getWidth(), getHeight());

      	setX(getX()+ getXSpeed());
		//setY
		
		setY(getY() + getYSpeed());

		//draw the ball at its new location
		
		window.setColor(randomColor());
		window.fillOval(getX(), getY(), getWidth(), getHeight());
   }
}