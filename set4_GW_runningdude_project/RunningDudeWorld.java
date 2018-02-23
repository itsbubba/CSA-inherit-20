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

public class RunningDudeWorld extends ActorWorld
{
	private Actor dude;
	
   public RunningDudeWorld()
   {
		//make a super call
		
		//make dude refer to a RunningDude
		
		//add dude to the world
      
      setMessage("Running Dude 2.0!");
   }

	public boolean keyPressed(String description, Location loc)
	{
		Grid<Actor> grid = getGrid();		

		return true;
	}
}