package arraylist;

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<String>();
		ArrayList<Square> squareList = new ArrayList<Square>();
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();
		
		stringList.addItem("First string.");
		stringList.addItem("Second string.");
		stringList.addItem("Fourth string.");
		stringList.addItem("What happened to the \"third string\"?");
		System.out.println("\nstringList:");
		System.out.println("-----------");
		System.out.println(stringList.toString());

		squareList.addItem(new Square(3.445));
		squareList.addItem(new Square(65.67));
		squareList.addItem(new Square(23456.0));
		squareList.addItem(new Square(102.2345));
		System.out.println("\nsquareList:");
		System.out.println("-----------");
		System.out.println(squareList.toString());

		pointList.addItem(new PointThreeD(1.2, 1.4, 2.4));
		pointList.addItem(new PointThreeD(23.5, 12.456, 9.0));
		pointList.addItem(new PointThreeD(4, 5, 6));
		pointList.addItem(new PointThreeD(100.00, 345.67, 2.3));
		System.out.println("\npointList:");
		System.out.println("----------");
		System.out.println(pointList.toString());

	}//end main

}//end class
