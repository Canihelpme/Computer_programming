package java_lab_03;

public class five_point_twenty {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
		int count = 0; // Count the number of prime numbers

		System.out.println(
			"The prime numbers between 2 and 1,000, inclusive are \n");

		for (int number = 2; number <= 1000; number++) 
		{
			boolean isPrime = true;	
			
			for (int divisor = 2; divisor <= number / 2; divisor++) 
			{
				if (number % divisor == 0)	
				{ 
					isPrime = false;	
					break;	
				}
			}

			// Display the prime number and increase the count
			if (isPrime) 
			{
				count++;	
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
				{
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
		}
	}

}
