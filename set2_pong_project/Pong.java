//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;


public class Pong extends Canvas implements KeyListener, Runnable
{
	//private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int score1;
	private int score2;
	private double posneg;
	private BlinkyBall ball;
	//private SpeedUpBall ball;


	public Pong()
	{
		posneg = Math.random();
		
		if(posneg>.5)
		{
			posneg = 1;
		}
		else
		{
			posneg = -1;
		}
		
		//Ball
		
		ball = new BlinkyBall(400,100,30,30,Color.WHITE,(int)posneg*5,2);
		//ball = new SpeedUpBall(400,100,30,30,Color.WHITE,(int)posneg*5,2);


		leftPaddle = new Paddle(30,200,20,100,Color.RED,8);
		rightPaddle = new Paddle(740,200,20,100,Color.RED,8);
		score1 = 0;
		score2 = 0;

		keys = new boolean[4];

    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		
	}
	
   public void update(Graphics window)
   {
	   paint(window);
   }

   public void paint(Graphics window)
   {
		Graphics2D twoDGraph = (Graphics2D)window;

		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Right score :: " + score1, 400, 500);
		graphToBack.drawString("Left score :: " + score2, 400, 510);
		
		
		if(!(ball.getX()>=0 && ball.getX()<=750))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			graphToBack.drawString("right score :: " + score1, 400, 500);
			graphToBack.drawString("left score :: " + score2, 400, 510);
			
			
			if(ball.getX()<300)
			{
				score1++;
				graphToBack.drawString("Right score :: " + score1, 400, 500);
				graphToBack.drawString("Left score :: " + score2, 400, 510);
			
			}
			else
			{
				score2++;
				graphToBack.drawString("Left score :: " + score2, 400, 510);
				graphToBack.drawString("Right score :: " + score1, 400, 500);
			
			}
			
			try
			{
				Thread.currentThread().sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			
			posneg = Math.random();
			if(posneg>.5)
			{
				posneg = 1;
			}
			else
			{
				posneg = -1;
			}
			
			ball.setColor(Color.BLACK);
			ball.moveAndDraw(graphToBack);
			//Ball
			
			ball = new BlinkyBall(400,100,30,30,Color.RED,(int)posneg*5,2);
			//ball = new SpeedUpBall(400,100,30,30,Color.WHITE,(int)posneg*5,2);

		}

		if(!(ball.getY()>=25 && ball.getY()<=525))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		if((ball.getX()<=leftPaddle.getX()+leftPaddle.getWidth()+Math.abs(ball.getXSpeed())) && (ball.getY()>=leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()  || ball.getY() + ball.getHeight() >= leftPaddle.getY() && ball.getY() + ball.getHeight()  < leftPaddle.getY() + leftPaddle.getHeight()))
		{
   			if(ball.getX()<=leftPaddle.getX()-leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))
   			{
   				ball.setYSpeed(-ball.getYSpeed());
   			}
   			else
   			{
   				ball.setXSpeed(-ball.getXSpeed());
   			}       			 		
		}

		if((ball.getX()>=rightPaddle.getX()-rightPaddle.getWidth()-Math.abs(ball.getXSpeed())) && (ball.getY()>=rightPaddle.getY() && ball.getY()<=rightPaddle.getY()+rightPaddle.getHeight()  || ball.getY()+ball.getHeight()>=rightPaddle.getY() && ball.getY()+ball.getHeight()<rightPaddle.getY()+rightPaddle.getHeight()))
		{
   			if(ball.getX()<=rightPaddle.getX()-rightPaddle.getWidth()-Math.abs(ball.getXSpeed()))
   			{
   				ball.setYSpeed(-ball.getYSpeed());
   			}
   			else
   			{
   				ball.setXSpeed(-ball.getXSpeed());
   			}       			 		
		}
		
		if(keys[0]==true)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1]==true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2]==true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);

		}
		if(keys[3]==true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);

		}
	
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   			
   		   	Thread.currentThread().sleep(8);
           repaint();
         }
      }catch(Exception e)
      {
      	
      }
  	}	
}