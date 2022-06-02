package game;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class GameBoard extends JPanel implements KeyListener {

	Egg egg = new Egg(425,120,"images//egg.png");
	Basket basket = new Basket (450,645,"images//basket.png");
	
	Chicken[] chickens = new Chicken[5];
	
	Border border = new Border(0,108,"images//border.gif");
	
	static int score = 0;
	
	
	public GameBoard(){
		
		super();
		
        int x = 0, y = 0;
		
		for(int i = 0; i < chickens.length; i++){
			
			chickens[i] = new Chicken(x,y,"images//chicken.png");
			x = x + 200;
		}
		
		super.setFocusable(true);
		super.addKeyListener(this);
		eggFall();
		
	}
	
	
	public void eggFall(){
		
		EggFall ef = new EggFall(egg,basket,this,chickens);
		ef.start();
		
    }
	
	
	
	public void paint(Graphics g){
		
		ImageIcon backg = new ImageIcon("images//gameback.png");
		g.drawImage(backg.getImage(), 0, 0, null);
		basket.draw(g);
		border.draw(g);

		for(int i = 0; i < chickens.length; i++)
			chickens[i].draw(g);
		
		egg.draw(g);
		
		g.setColor(Color.BLACK);
		g.drawString("Score = " + score, 750, 330);
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
	
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			
			if(basket.getX() > 0)
				basket.setX(basket.getX() - 5);
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			
			if(basket.getX() < 900)
				basket.setX(basket.getX() + 5);
			
			
		}
		
		
		super.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
	
	
	
	
}
