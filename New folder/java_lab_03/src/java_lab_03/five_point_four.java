package java_lab_03;

public class five_point_four {
	public static void main(String [] args)
	{
		int mile = 1;
		double kilo = 0;
		System.out.println("Miles        Kilo");
		while(mile <= 10)
		{
			kilo = mile * 1.609;
			System.out.printf("%-13d%-10.3f\n",mile, kilo);
			++mile;
		}
	}
}
