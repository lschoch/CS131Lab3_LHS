package arraylist;

/**
 * This class is set of three points to represent a point in three dimensional
 * space.
 *
 * @author lschoch
 * @version 1.0 CS-131-ON Fall/2021
 */
public class PointThreeD {
	private double xPoint = 0; // The x coordinate of the point
	private double yPoint = 0; // The y coordinate of the point
	private double zPoint = 0; // The z coordinate of the point

	/**
	 * The empty-argument constructor to initialize the instance variables.
	 */
	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;

	}// end empty-argument constructor

	/**
	 * Constructor to create object with common usage. This is the preferred
	 * constructor.
	 * 
	 * @param x the x coordinate of the point
	 * @param y the y coordinate of the point
	 * @param z the z coordinate of the point
	 */
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;

	}// end preferred constructor

	/**
	 * Method to convert the data of the class to a string.
	 * 
	 * @return the string representation of the class data
	 */
	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";

	}// end toString

}// end class
