package week1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		int isDivisibleCount = 0;
		boolean isPrime = false;
		for(int i=1; i<=input; i++) {
			if(input%i == 0)
				isDivisibleCount++;
		}
		if(isDivisibleCount == 2)
			isPrime = true;
		if(isPrime)
			System.out.println("The given number " + input + " is a Prime Number");
		else
			System.out.println("The given number " + input + " is not a Prime Number");
	}

}
