//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class RunningDudeRunner
{
   public static void main(String[] args)
   {
      ActorWorld test = new ActorWorld();
      test.add(new Location(2,3),new RunningDude());
      test.show();
   }
}