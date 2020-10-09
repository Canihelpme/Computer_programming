package java_lab_03;
import java.util.*;

public class five_point_fourtyone 
{
	 public static void main(String[] strings) {

	        Scanner input = new Scanner(System.in);
	        int largest = 0;
	        int occurrence = 0;
	        int number;

	        System.out.print("Enter number: ");
	        do {
	            number = input.nextInt();
	            if (number > largest) {
	                occurrence = 0;
	                largest = number;
	            }
	            if (number == largest) {
	                occurrence++;
	            }

	        } while (number != 0);

	        System.out.println("The largest number is " + largest);
	        System.out.println("The occurrence count is " + occurrence);
	    }
}
