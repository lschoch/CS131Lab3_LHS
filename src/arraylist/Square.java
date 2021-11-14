package arraylist;

public class Square {
	private double side = 0;
	
	public Square() {
		side = 0;
		
	}//end empty-argument constructor
	
	public Square(double side)  {
		this.side = side;
		
	}//end preferred constructor
	
	public double getArea() {
		return side*side;
		
	}//end getArea

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
		
	}//end toString
	
}
