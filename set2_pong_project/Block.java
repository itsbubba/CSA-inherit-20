//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public Color color;

	public Block()
	{
		setX(150);
		setY(150);
		setWidth(10);
		setHeight(10);
		setColor(Color.RED);
	}
	
	public Block(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(Color.RED);
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	
	public Block(int x, int y)
	{
		setX(x);
		setY(y);
		setWidth(10);
		setHeight(10);
		setColor(Color.RED);
	}
	
   public void setColor(Color col)
   {
   		color = col;
   }
   
   public void setX(int xp)
   {
   		xPos = xp;
   }
   
   public void setY(int yp)
   {
   		yPos = yp;
   }
   
   public void setPos(int x, int y)
   {
   		xPos = x;
   		yPos = y;
   }
   
   public void setWidth(int w)
   {
   		width = w;
   }
   
   public void setHeight(int h)
   {
   		height = h;
   }

   public void draw(Graphics window)
   {
      window.setColor(Color.RED);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
  
   public void draw(Graphics window, Color col)
   {
   	  window.setColor(col);
   	  window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block preston = (Block)obj;
		boolean output = false;
		
		if(preston.getX()==xPos&&preston.getY()==yPos&&preston.getWidth()==width&&preston.getHeight()==height){
			output = true;
		}
		 return output;
	}   
   
   public Color getColor()
   {
   		return color;
   }
   
   public int getX()
   {
   		return xPos;
   }
   
   public int getY()
   {
   		return yPos;
   }
   
   public int getWidth()
   {
   		return width;
   }
   
   public int getHeight()
   {
   		return height;
   }
    
   public String toString()
   {
   		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
   }
}