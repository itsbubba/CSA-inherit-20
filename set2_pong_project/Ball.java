//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(100,100);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	//add the other Ball constructors
	public Ball(int x, int y)
	{
		setX(x);
		setY(y);
		setXSpeed(3);
		setYSpeed(1);
		
	}
	
	public Ball(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setXSpeed(3);
		setYSpeed(1);
		
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
		setXSpeed(3);
		setYSpeed(1);
		
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xs, int ys)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
		setXSpeed(xs);
		setYSpeed(ys);
		
	}
	
	
   //add the set methods
   
   public void setXSpeed(int x)
   {
   	   xSpeed = x;
   	   
   }
   
   public void setYSpeed(int y)
   {
   	   ySpeed = y;
   	   
   }
   //draw the ball at its new location
   
   public void moveAndDraw(Graphics window)
   {
   	   window.setColor(Color.WHITE);
 	   window.fillOval(getX(), getY(), getWidth(), getHeight());
       setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
	   window.setColor(super.getColor());
   	   window.fillOval(getX(), getY(), getWidth(), getHeight());
	  
   }
   
	public boolean equals(Object obj)
	{
		Ball sai = (Ball)obj;
		boolean output = false;
		
		if(super.equals(sai)==true&&sai.getXSpeed()==xSpeed&&sai.getYSpeed()==ySpeed)
		{
			output = true;
		}

		return output;
	}   

   //add the get methods
   
   public int getXSpeed()
   {
   	   return xSpeed;
   	   
   }
   
   public int getYSpeed()
   {
   	   return ySpeed;
   	   
   }

   //add a toString() method
   
   public String toString()
   {
   	   return super.toString() + " "+getXSpeed()+" "+getYSpeed();
   }
}