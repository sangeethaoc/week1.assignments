package week1.assignments;

public class Palindrome {

	public static void main(String[] args) 
	{
		int input = 34343;
		int reverse =0;
		
		/*
		 * while(temp>0) { if(temp % 10 != 0) { reverse = reverse*10 + temp%10; temp =
		 * temp/10; } }
		 */
		for(int temp = input; temp>0; temp=temp/10)
		{
			reverse = reverse*10 + temp % 10;
		}
		if(input == reverse )
			System.out.println("The given number "+input+ "is a palindrome number");
		else
			System.out.println("The given number "+input+ "is not a palindrome number");
	}

}
