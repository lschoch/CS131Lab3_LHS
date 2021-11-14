package arraylist;

/**
 * This class is a representation of a geometric square.
 *
 * @author lschoch
 * @version 1.0 CS-131-ON Fall/2021
 */
public class Square {
	private double side = 0; // The length of a side of the square

	/**
	 * The empty-argument constructor to initialize the instance variables.
	 */
	public Square() {
		side = 0;

	}// end empty-argument constructor

	/**
	 * Constructor to create object with common usage. This is the preferred
	 * constructor.
	 * 
	 * @param side the length of a side of the square
	 */
	public Square(double side) {
		this.side = side;

	}// end preferred constructor

	/**
	 * Method to compute the area of the square.
	 * 
	 * @return the area of the square
	 */
	public double getArea() {
		return side * side;

	}// end getArea

	/**
	 * Method to convert the data of the class to a string.
	 * 
	 * @return the string representation of the class data
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + " area=" + getArea() + "]";

	}// end toString

}
