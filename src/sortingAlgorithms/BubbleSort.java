package sortingAlgorithms;

/*
 * Performance degrades quickly, not advised.
 * In-place algorithm, we don't create another array.
 * O(n^2) time complexity-- quadratic, coz of two loops. 
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {
	int[] intArray = new int[7];
		
		intArray[0] = 20;  
		intArray[1] = 35;
		intArray[2]= -15;
		intArray[4]=  7;
		intArray[5] = 7;
		intArray[6]= -22;
		
		/*
		 * My implementation
		 */
		
		for (int j= 0; j <intArray.length; j++) {
		for (int i=0 ; i < intArray.length -1 ; i++) {
			if (intArray[i] > intArray[i+1]) {
				int temp = intArray[i];
				intArray[i] = intArray[i+1];
				intArray[i+1] = temp;
			}
		}
		}
		
		for (int k = 0; k < intArray.length; k++) {
			System.out.println(intArray[k]);
		}
	}
		
}
		
		/*
		 * Their Implementation
		 */
//		for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
//			for (int i = 0; i < lastUnsortedIndex; i++) {
//				if (intArray[i] > intArray[i+1]) {
//					swap(intArray, i, i+1);
//				}
//			}
//			
//			for (int k = 0; k < intArray.length; k++) {
//				System.out.println(intArray[k]);
//			}
//			
//		}
//	}
//		
//		public static void swap (int[] array, int i, int j ) {
//			if (i==j) {
//				return;
//			}
//			int temp = array[i];
//			array[i] = array[j];
//			array [j] = temp;
//		}
//		
//	
//	}
//

