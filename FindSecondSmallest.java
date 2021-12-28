package week1.assignments;

import java.util.Arrays;

public class FindSecondSmallest {

	public static void main(String[] args) {
		//Here is the input
		int[] inputArr =  {23,45,67,32,89,22};
		
		//Sort the given array in ascending order
		Arrays.parallelSort(inputArr);
		
		//Prints the second smallest number in the given array
		System.out.println("The second smallest number in the given array is " +inputArr[1]);
		
	}

}
