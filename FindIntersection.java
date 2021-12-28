package week1.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		// Declare An array for {3,2,11,4,6,7};
		int[] inputArray1 =  {3,2,11,4,6,7};
		
		// Declare An array for {1,2,8,4,9,7};
		int[] inputArray2 =  {1,2,8,4,9,7};
		
		//
		System.out.println("Common elements in both the arrays are :");
		
		//Iterate the first input array
		for(int i=0;i<inputArray1.length;i++)
		{
			//Iterate the second input array
			for(int j=0;j<inputArray2.length;j++)
			{
				//Compare the elements in both the array
				if(inputArray1[i] == inputArray2[j])
				{
					//Prints the common element in both the array
					System.out.println(inputArray1[i]);
					break;
				}
			}
		}
	}

}
