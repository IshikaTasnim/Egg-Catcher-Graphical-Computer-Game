package game;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		GameBoard gb = new GameBoard();
		
		JFrame gameFrame = new JFrame();
		
		gameFrame.setTitle("EGG CATCHER");
		gameFrame.setSize(1000, 720);
		gameFrame.add(gb);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		
		
		
		
		
	}

}
