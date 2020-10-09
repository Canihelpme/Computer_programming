package Basic;

public class Example {
	
	public static void main(String[] args)
	{
		double x, y;
		double z;
		final int a = 1;
		/*Final int와 같이 Final 사용시 절대 변경불가능한 상수취급해야함. */
		final double PI = 3.14159;
		x = 7;
		y = 2;
		z = x / y;
		/*변수 설정시 첫simple은 소문자이나 Caculator는 대문자
		 *int simepleCalculator = 2;
		  SIMPLECALCULATOR 처럼 쓰는 경우는 언제임?*/
		
		
		System.out.println("x" + x);
		System.out.println("y" + y);
		System.out.println("z" + z);
		System.out.println("x+y = " + (x+y));
		System.out.println("x / y = "+ (x/y));
		System.out.println("PI = "+ PI);
		
	}

}
