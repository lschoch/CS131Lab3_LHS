package arraylist;

/**
 * This class is a parameterized array of objects with a method to add items to
 * the array and a method to convert the class data to a string.
 *
 * @author lschoch
 * @version 1.0 CS-131-ON Fall/2021
 */
public class ArrayList<T> {
	private final int DEFAULT_SIZE = 10; // A constant to hold the default size of the array.
	private int currentItem = 0; // An integer to hold the index of the next available array slot.
	private T arList[]; // The parameterized array of objects.

	/**
	 * The empty-argument constructor to initialize the instance variables.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList() {
		/*
		 * The code below will cause a compile error because T is cast to object if we
		 * cast object to whatever T is (like a String) we will cause a runtime error.
		 * We could use a java collection like ArrayList for this.
		 */
		// arList=new T[DEFAULT_SIZE];

		// this is the proper way to initialize this object using a call to new Object.
		arList = (T[]) new Object[DEFAULT_SIZE];

	}// end empty-argument constructor

	/**
	 * Constructor to create object with common usage. This is the preferred
	 * constructor.
	 * 
	 * @param length the capacity of the parameterized array
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int length) {
		if (length <= 0) {
			length = DEFAULT_SIZE;
			System.out.println("Invalid input for length. Used default value (" + DEFAULT_SIZE + ").");
		}

		// arList=new T[length]; //causes a compile error (see above)
		arList = (T[]) new Object[length];

	}// end preferred constructor

	/**
	 * Method for adding elements to the parameterized array.
	 * 
	 * @param item the item to be added to the array
	 * @return true if the item is successfully added, otherwise false
	 */
	public Boolean addItem(T item) {
		if (arList.length <= 0 || currentItem == arList.length)
			return false;
		else {
			arList[currentItem] = item;
			currentItem++;
			return true;
		}

	}// end addItem

	/**
	 * Method to convert the data of the class to a string.
	 * 
	 * @return the string representation of the class data
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < currentItem - 1; i++) {
			sb.append(arList[i].toString() + "\n");
		}
		sb.append(arList[currentItem - 1]);
		return sb.toString();

	}// end toString

}// end class
