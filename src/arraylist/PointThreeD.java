package arraylist;

public class PointThreeD {
	private double xPoint = 0;
	private double yPoint = 0;
	private double zPoint = 0;
		
	public PointThreeD() {
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
		
	}//end empty-argument constructor
	
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
		
	}//end preferred constructor

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
		
	}//end toString
	

}//end class
