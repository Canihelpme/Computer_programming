package Basic;

public class Example5 {

	public static void hihi(String[] args)
	{
		int i = 10;
		int j = 20;
		
		int z = ++i+j;
		
		System.out.println("z =  "+ z);
		System.out.println("i = "+ i);
	}
	
	public static void multiple_variable(String[] args)
	{
		byte a = 10;
		int  b = 15;
		double c = 3.152;
		double d = 1.453;
		
		double k = a+b;
		int t = (int)c;
		
		System.out.println("k = "+ k);
		System.out.println("t = "+ t);

	}
	
	public static void main(String[] args)
	{
		hihi(null);
		multiple_variable(null);
	}
}
