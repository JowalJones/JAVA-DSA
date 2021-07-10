package complexityAndArrays;

/**
 * Retrieveing an item is in constant time  
 * @author jones
 *
 */

public class Arrays {

	public static void main(String[] args) {
		int[] intArray = new int[7]; //Arrays aren't dynamic.
		
		intArray[0] = 20;  
		intArray[1] = 35;
		intArray[2]= -15;
		intArray[4]=  7;
		intArray[5] = 1;
		intArray[6]= -22;
		
//		for (int i = 0; i < intArray.length; i++) { // Constant time
//			System.out.println(intArray[i]);
//		}
		
		int index = -1;
		for (int i = 0; i < intArray.length; i++) { //Finding particular item 
			if (intArray[i]==7) {
				index = i; 
				break;
			}
			
		}
		System.out.println("Item found at index "+index);


	}

}
