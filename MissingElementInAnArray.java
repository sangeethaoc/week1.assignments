package week1.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) 
	{
		// Here is the input
		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };

		// Sort the array in acsending order
		Arrays.parallelSort(arr);

		// Iterate the array using for loop
		for (int i = 0; i < arr.length; i++) {
			
			// Check if the array index + 1 is equal to array value
			if (i + 1 != arr[i]) 
			{
				// Prints the missing element in the array
				System.out.println("Missing element in the array is : " + (i + 1));
				break;
			}
		}
	}

}
