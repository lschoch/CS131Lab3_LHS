package arraylist;

/**
 * Class to test the classes and methods of this package.
 *
 * @author lschoch
 * @version 1.0 CS-131-ON Fall/2021
 */
public class ListApp {

	/**
	 * The main method. Instantiates three lists and prints their data.
	 * 
	 * @param args this method does not use command line arguments
	 */
	public static void main(String[] args) {

		// Instantiate three lists, each of a different object type.
		ArrayList<String> stringList = new ArrayList<String>();
		ArrayList<Square> squareList = new ArrayList<Square>();
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();

		// Add items to the list of strings and print
		stringList.addItem("First string.");
		stringList.addItem("Second string.");
		stringList.addItem("Fourth string.");
		stringList.addItem("What happened to \"Third string.\"?");
		System.out.println("\nstringList:");
		System.out.println("-----------");
		System.out.println(stringList.toString());

		// Add items to the list of squares and print
		squareList.addItem(new Square(3.445));
		squareList.addItem(new Square(65.67));
		squareList.addItem(new Square(23456.0));
		squareList.addItem(new Square(102.2345));
		System.out.println("\nsquareList:");
		System.out.println("-----------");
		System.out.println(squareList.toString());

		// Add items to the list of points and print
		pointList.addItem(new PointThreeD(1.2, 1.4, 2.4));
		pointList.addItem(new PointThreeD(23.5, 12.456, 9.0));
		pointList.addItem(new PointThreeD(4, 5, 6));
		pointList.addItem(new PointThreeD(100.00, 345.67, 2.3));
		System.out.println("\npointList:");
		System.out.println("----------");
		System.out.println(pointList.toString());

	}// end main

}// end class
