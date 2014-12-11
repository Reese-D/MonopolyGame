import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Canvas extends JFrame {
	ArrayList<Square> squares;
	ArrayList<Player> players;
	private final int SWIDTH = 1080;
	private final int SHEIGHT = 620;
	private final int SIDES = 4;
	JPanel mBoard;
	JPanel mGlassPane;
	
	public Canvas(ArrayList<Square> squares, ArrayList<Player> players){

		this.squares = squares;
		mBoard = new Board(squares, SWIDTH, SHEIGHT);
		mGlassPane = new GlassPane(players);
		
		
		//2. Optional: What happens when the frame closes?
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		//Create a panel and add components to it.


		//contentPane.setPreferredSize(new Dimension(SWIDTH, SHEIGHT));
		mBoard.setPreferredSize(new Dimension(SWIDTH, SHEIGHT));
		mGlassPane.setPreferredSize(new Dimension(SWIDTH, SHEIGHT));
		this.add(mBoard);
		//this.add(mGlassPane);
		//mGlassPane.setVisible(false);

		/*TODO instead of making board just pass it a "Graphic g" from the pane that needs to draw it and have it render the background
		 * then call another class to draw the animation, might need to clear screen*/
		
		
		//this.add(mGlassPane);
		
		//4. Size the frame.
		this.pack();

		//5. Show it.
		this.setVisible(true);

	}
	
	
	public void movePlayer(int player, int roll){
		
	}
	
	public static void main(String args[]){
		ArrayList<Square> b = new ArrayList<Square>();
		for(int x = 0; x < 38; x ++){
			b.add(new Square());
		}
		Square temp1 = new Square();
		temp1.setColor(Color.RED);
		temp1.setNameLine1("Golden");
		temp1.setNameLine2("Temple");
		temp1.setCurrentCost(400);
		Square temp2 = new Square();
		temp2.setColor(Color.MAGENTA);
		temp2.setNameLine1("New Ark");
		temp2.setNameLine2("Park");
		temp2.setCurrentCost(280);
		b.add(temp1);
		b.add(temp2);
		Canvas c = new Canvas(b, null);
	}
}
