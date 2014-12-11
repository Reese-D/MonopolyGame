import java.awt.Color;


public class Square {
	String nameLine1, nameLine2;
	int currentCost;
	Color color;
	public Square(){
		color = Color.BLUE;
		nameLine1 = "default";
		nameLine2 = "name";
	}
	public void setCurrentCost(int c){
		currentCost = c;
	}
	public int getCurrentCost(){
		return currentCost;
	}
	
	public String getNameLine1(){
		return nameLine1;
	}
	
	public void setNameLine1(String s){
		nameLine1 = s;
	}
	public String getNameLine2(){
		return nameLine2;
	}
	
	public void setNameLine2(String s){
		nameLine2 = s;
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
}
