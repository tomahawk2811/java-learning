package SimplePrograms;
import java.util.*;

@SuppressWarnings("unused")
public class LeapYear {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year:  ");
		int year = input.nextInt();
		
		boolean isLeapYear =
		 (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		System.out.println(year + "is a leap year? " + isLeapYear);

	}
}
