//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color; 
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

public class Snake
{
	private Actor head;
   private Actor tail;		
   private int foodEaten;
   private boolean didEat;
   private boolean isDead;
	
   public Snake()
   {
		head = new Section();
		head.setDirection(0);	
		tail = head;		
		foodEaten = 0;
		isDead = false;  	
   }
   
   public void putSelfInGrid(Grid<Actor> grid, Location loc)
   {
		head.putSelfInGrid(grid, loc);		
   }  
   
	public void move()
	{	
		//make sure snake is not dead and that the grid is not null
	

		//make  new Section for this Snake
		//get the location of where this new Section might appear

		
		//check for valid location
					
			//check to see if this spot is not null
		
			
				//check to see if a Snake Section found
				
				
				
				//else check to see if Food found
				
				
				
				
				
			//if spot is null
				//move up to this spot
				
		//remove the tail is snake is trying to move off the grid			
	
	}
	
	public void removeTail()
   { 
      
      //if the snake is moving normally
      //the tail gets removed as a new section is added to the front
      
	}
	
   public void setDirection(String dir)
   {
   	//change the direction of the head of the snake
   }
   
	public int getFoodEaten()
	{
		return 0;
	}
	
	public void setFoodEaten(int amount)
	{
	
	}
	
	public boolean isDead()
	{
		return false;
	}	
}