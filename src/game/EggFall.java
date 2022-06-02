package game;

import java.awt.Rectangle;

public class EggFall extends Thread {

	Egg egg;
	GameBoard gb;
	Basket bs;
	Chicken [] ch;
	public EggFall(Egg egg, Basket bs, GameBoard gb, Chicken [] ch) {
		
		this.egg = egg;
		this.bs = bs;
		this.gb = gb;
		this.ch = ch;
}
	
	public void run(){
		
		while(true){
			
			egg.setY(egg.getY() + 1);
			checkCollision();
			
			
		try{
			Thread.sleep(8);
		}
		catch(Exception e){
			
			
		}
		
		gb.repaint();
		
		if(egg.getY() > 720)
		{
			

			egg.setX(ch[(int)(Math.random()*5)].getX() + 25);
			egg.setY(ch[(int)(Math.random()*5)].getY() + 120);
		}
		
	}
		
		
		
}
	
public void checkCollision(){
		
		Rectangle basketRect = new Rectangle(bs.getX(),bs.getY(),100,65); 
		Rectangle eggRect    = new Rectangle(egg.getX(),egg.getY(),45,67); 
		
		if(eggRect.intersects(basketRect) == true){
			
			egg.setX(ch[(int)(Math.random()*5)].getX() + 25);
			egg.setY(ch[(int)(Math.random()*5)].getY() + 120);
			GameSound.EggCatchSound();
			GameBoard.score += 10;
		}
		
	}
	
	
}
