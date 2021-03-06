package java_lab_04;

public class Exercise_06_10_add_PrimeNumberMethod 
{
	public static void main(String[] args)
	{
		System.out.println("The first 50 prime numbers are \n");
		print_prime_numbers(50);
	}
	
	public static void print_prime_numbers(int number_of_prime)
	{
		final int Number_of_primes_per_line = 10;
		int count = 0;
		int number = 2;
		
		while(count < number_of_prime)
		{
			if(isPrime(number))
			{
				count++;
				
				if(count % Number_of_primes_per_line == 0)
				{
					System.out.printf("%-5s\n", number);
				}
				else
					System.out.printf("%-5s", number);
			}
			
			number++;
		}
	}
	
	public static boolean isPrime(int number)
	{
		for(int divisor = 2; divisor <= number/2; divisor++)
		{
			if(number % divisor == 0)
			{
				return false;
			}
		}
		return true;
	}

}
