package game;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Egg {

	private int x , y;
	private String imagepath;
	
	public Egg(int x, int y, String imagepath) {
		this.x = x;
		this.y = y;
		this.imagepath = imagepath;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw(Graphics g){
			
	    ImageIcon egg = new ImageIcon(imagepath);
	    g.drawImage(egg.getImage(), x, y, null);
		
	}
		
	
}
