package week1.assignments;

public class ConvertNegativeToPositiveNumber {

	public static void main(String[] args) {
		int input = -40;
		if(input<0)
		{
			System.out.println("The given number "+input + " is negative");
			System.out.println("*****************************************");
			System.out.println("The Number " +input + "is converted to " +(-input));
			System.out.println("The Number " +input + "is converted to " +(input * (-1)));
			System.out.println("The Number " +input + "is converted to " + Math.abs(input));
			System.out.println("The Number j" +input + "is converted to " +(~(input - 1)));
		}
		else
			System.out.println("The given number "+input + " is positive");
	}

}
