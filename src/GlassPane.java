import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;


public class GlassPane extends JPanel{
	ArrayList<Player> players;
	
	public GlassPane(ArrayList<Player> players) {
		this.players = players;
		this.setBackground(Color.BLACK);
		this.setOpaque(false);
		
	}
	
	 protected void paintComponent (Graphics g) {
		 	super.paintComponent(g);
		 	g.drawRect(0, 0, 100, 100);
	 }

}
