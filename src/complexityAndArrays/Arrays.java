package complexityAndArrays;

/**
 * Retrieveing an item whose index we know  is in constant time
 * Retrieve with index O(n)  
 * Adding element to full array O(n)
 * Adding element to end of array with space O(1)
 * Insert or update element a specific index O(1)
 * Delete element by setting it to null O(1)
 * Delete element by shifting elements O(n)
 * 
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
		
//		for (int i = 0; i < intArray.length; i++) { // Constant time O(1)
//			System.out.println(intArray[i]);
//		}
		
		/**
		 * //Finding particular item whose index we don't know
		 * Takes linear time as we search through all items. O(n)
		 * 
		 */
		int index = -1;
		for (int i = 0; i < intArray.length; i++) { 
			if (intArray[i]==7) {
				index = i; 
				break;
			}
			
		}
		System.out.println("Item found at index "+index);


	}

}
