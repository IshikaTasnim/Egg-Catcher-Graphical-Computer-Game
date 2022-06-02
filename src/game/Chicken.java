package game;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Chicken {

	private int x , y;
	private String imagepath;
	
	public Chicken(int x, int y, String imagepath) {
		
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
		
		ImageIcon ch = new ImageIcon(imagepath);
		g.drawImage(ch.getImage(), x, y, null);
	
	}
	
}
