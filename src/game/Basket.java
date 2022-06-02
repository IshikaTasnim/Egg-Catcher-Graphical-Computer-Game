package game;

import java.awt.*;
import javax.swing.*;


public class Basket {

	private int x , y;
	private String imagepath;
	
	public Basket(int x, int y, String imagepath) {
		
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
		
		ImageIcon bs = new ImageIcon(imagepath);
		g.drawImage(bs.getImage(), x, y, null);
		
	}
	
	
	
}
