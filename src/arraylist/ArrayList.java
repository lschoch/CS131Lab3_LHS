package arraylist;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
	   	/*
	   	 * The code below will cause a compile error because T is cast to object
	   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
	   	 * We could use a java collection like ArrayList for this.     
	   	 */
		// arList=new T[DEFAULT_SIZE];                                        				  	
				  
	    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
		arList=(T[]) new Object[DEFAULT_SIZE];
	
    }//end empty-argument constructor 
   	
   	@SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
   		if (length <= 0) {
   			length = DEFAULT_SIZE;
   			System.out.println("Invalid input for length. Used default value (" 
   			+ DEFAULT_SIZE + ").");
   		}

   		// arList=new T[length]; //causes a compile error (see above)
   		arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
   	public Boolean addItem(T item) {
	 	if (arList.length <= 0 || currentItem == arList.length) 
	 		return false;
	 	else {
	 		arList[currentItem] = item;
	 		currentItem++;
	 		return true;
	 	}
	 	
   	}//end addItem
   	
   	@Override
   	public String toString() {
   		StringBuilder sb = new StringBuilder("");
   	
   		for (int i=0; i<currentItem-1; i++) {
   			sb.append(arList[i].toString() + "  ");
   		}
   		sb.append(arList[currentItem-1]);
   		return sb.toString();
   		
   	}//end toString
   	
}//end class
