package sortingAlgorithms;

/*
 * We traverse across array and look for largest element, then take it to the last positon 
 */

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] intArray = {30, 56, -3, 1, -22, -15, 35, 20, 55};
		
		
	/*
	 * My implementation
	 */
		
//		for (int j = intArray.length -1 ; j > 0; j--) {
//			
//			int largest = 0;
//			int i = 0;
//			for (int h =0; h <= j; h++) 
//			
//			 {
//			
//			if (intArray[largest] < intArray[h]) {
//			    i = h;
//				largest = i;
//					
//			}
//			
//		}
//			int temp = intArray[i];
//			intArray[i] = intArray[j];
//			intArray[j] = temp;
//			
//			}
//		for (int k = 0; k < intArray.length; k++) {
//			System.out.println(intArray[k]);
//		}
//		
//
//	}

	        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
	                lastUnsortedIndex--) {

	            int largest = 0;

	            for (int i = 1; i <= lastUnsortedIndex; i++) {
	                if (intArray[i] > intArray[largest]) {
	                    largest = i;
	                }
	            }

	            swap(intArray, largest, lastUnsortedIndex);

	        }


	        for (int i = 0; i < intArray.length; i++) {
	            System.out.println(intArray[i]);
	        }


	    }

	    public static void swap(int[] array, int i, int j) {

	        if (i == j) {
	            return;
	        }

	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;

	    }

	}


