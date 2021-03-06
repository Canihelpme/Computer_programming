/*
(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.
*/
package java_lab_04;

public class Exercise_06_10 
{
	public static void main(String[] args)
	{
		int number_of_primes = 0;
		for(int i = 1; i < 1000; i++)
		{
			if(Exercise_06_10_add_PrimeNumberMethod.isPrime(i))
				number_of_primes++;
		}
		System.out.println("The number of prime numbers less than 10000: "+ number_of_primes);
		
	}
	
}
