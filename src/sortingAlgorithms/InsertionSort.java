package sortingAlgorithms;

/*
 * My implementation
 */
//public class InsertionSort {
//	static int[] intArray = { 30, 56, -3, 1, -22, -15, 35, 20, 55 };
//	
//
//	public static void main(String[] args) {
//		
//		for (int i= 1; i < intArray.length; i++) { //Selects the first unsorted element
//			int marker = intArray[i];
//			int j = i-1;
//			
//			while (j >= 0 && intArray[j] > marker) { //shifts all elements to the right to create the position for unsorted element
//				intArray[j+1] = intArray[j];
//				j = j-1;
//			
//		
//
//			}
//			intArray[j+1] = marker; //inserts unsorted element to its correct position.
//			
//			
//			 
//		}
//		
//		
//		for (int k = 0; k < intArray.length; k++) {
//		System.out.println(intArray[k]);
//		}
//		
//		
//
//	}
//}
public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

}
