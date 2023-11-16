package Areas;
import java.util.*;
//SO DAMN HELPFUL ONG HOW DID I NOT KNOW ABOUT THIS ONE..IMPORTS ALL CLASSES NOPROBLEMOS
@SuppressWarnings("unused")
public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		  System.out.println("Enter a number for radius:   ");
		   double radius = input.nextDouble();
		    double area = radius * radius * 3.14159;
		   System.out.println("The area for the circle of the radius" + radius + " is "  + area);
          //Running a simple radius calculation using a scanner input.
	}
} 
