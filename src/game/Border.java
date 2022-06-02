package game;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Border {

	private int x , y;
	private String imagepath;
	
	public Border(int x, int y, String imagepath) {
		
		this.x = x;
		this.y = y;
		this.imagepath = imagepath;
	}
	
	public void draw(Graphics g){
		
	    ImageIcon border = new ImageIcon(imagepath);
	    g.drawImage(border.getImage(), x, y, null);
		
	}
	
}
