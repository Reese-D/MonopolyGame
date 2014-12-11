import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;


public class Board extends JPanel{
	/**
	 * 
	 */
	ArrayList<Square> squares;
	ArrayList<Player> players;
	private int boardWidth = 1080;
	private int boardHeight = 620;
	private final int SIDES = 4;
	JPanel mGlassPane;
	double squareWidth, squareHeight, cSPosX, cSPosY,aHeight, aWidth, mCSPosX,
	mCSPosY, mWidth, mHeight;

	public Board(ArrayList<Square> squares, int boardWidth, int boardHeight){
		this.boardWidth = boardWidth;
		this.boardHeight = boardHeight;
		this.squares = squares;
	}
	 protected void paintComponent (Graphics g) {
		 	super.paintComponent(g);
	    	squareWidth = boardWidth / (squares.size()/4 + 1);
	    	squareHeight = boardHeight / (squares.size()/4 + 1);
	    	//4 and 25 for the title bar and left hand side space
	    	cSPosX = 0;
	    	cSPosY = 0;
	    	mCSPosX = cSPosX ;
	    	mCSPosY = cSPosY + (squareHeight /5 * 4);
	    	mWidth = squareWidth;
	    	mHeight = squareHeight/5;
	    	int sideCounter = 0;
	    	int currentSide = 0;
		    for(Square item : squares){
		    	if(! (sideCounter < (squares.size()/4))){
		    		sideCounter = 0;
		    		currentSide++;
		    	}
		    	sideCounter++;
		    	if(sideCounter > 1 && sideCounter < (squares.size()/4 + 1)){
		    		g.setColor(item.getColor());
			    	g.fillRect((int)mCSPosX, (int)mCSPosY,(int) mWidth,(int) mHeight);
		    	}
		    	g.setColor(Color.BLACK);

		    	g.drawRect((int)cSPosX, (int)cSPosY, (int)squareWidth,(int) squareHeight);
		    	g.drawString(item.getNameLine1(), (int)( cSPosX + squareWidth/5), (int) (cSPosY + squareHeight/2 - 7));
		    	g.drawString(item.getNameLine2(), (int)( cSPosX + squareWidth/5), (int) (cSPosY + squareHeight/2 + 5));
		    	g.setColor(Color.RED);
		    	g.drawString(Integer.toString(item.getCurrentCost()), (int)( cSPosX + squareWidth/5 + 5), (int) (cSPosY + squareHeight/2 + 17));
		    	switch(currentSide){
		    	case 0:
			    	cSPosX += squareWidth;
			    	mCSPosX += squareWidth;
			    	
			    	//add one for rounding error
			    	mCSPosY = cSPosY + (squareHeight /5 * 4) + 1;
			    	break;
		    	case 1:
		    		cSPosY += squareHeight;
		    		
		    		mWidth = squareWidth/5;
		    		mHeight = squareHeight;
		    		mCSPosX = cSPosX;
		    		mCSPosY = cSPosY;
		    		break;
		    	case 2:
		    		cSPosX -= squareWidth;
		    		
		        	mWidth = squareWidth;
		        	mHeight = squareHeight/5;
			    	mCSPosX -= squareWidth;
		    		break;
		    	case 3:
		    		cSPosY -= squareHeight;
		    		
		    		mWidth = squareWidth/5;
		    		mHeight = squareHeight;
			    	mCSPosY -= squareHeight;
			    	mCSPosX = squareWidth - squareWidth / 5 + 1;
		    		break;
		    	}
		    }
		}
}
