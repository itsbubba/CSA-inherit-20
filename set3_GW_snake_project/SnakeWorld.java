//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color; 
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

public class SnakeWorld extends ActorWorld
{
	private int foodDelay;
	private Snake snake;
	
	public SnakeWorld(int width, int height)
	{
		super(new BoundedGrid<Actor>(width, height));
		Grid<Actor> grid = getGrid();		
		snake = new Snake();
		snake.putSelfInGrid(grid, new Location(4,7));	
		foodDelay = (int)(Math.random()*grid.getNumRows() * 3);
		setMessage("The Snake Game - Eat as many monkees as you can!");
	}

	public void step()
	{
		if(snake.isDead())
		{
			setMessage("Your snake is dead!  He ate "+ snake.getFoodEaten() + " monkees!");
		}
		else
		{
			//make sure the Grid is not null
			    
			setMessage("The Snake Game!!! - " + snake.getFoodEaten() + " monkees eaten so far!");
			
			//make the Snake move

			//if there is no Food
			//add some Food
		}
	}
	
	public boolean isFoodAllGone()
	{
		//check the grid to see if any Food remains
		//instanceof might prove useful
		
		return true;	
	}
	
	public void addFood()
	{
		//write the code to randomly place 1 Food in the grid
	}
	
	public boolean keyPressed(String description, Location loc)
	{
		//write the code to change the direction of the Snake 
		//based on the value of description	
		
		//the line below is an example of how to check the value of description
		//description.equals("LEFT")
	}
}