package SimplePrograms;
import java.util.*;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); {
		  }
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		//Convert Fahrenheit to Celsius
		@SuppressWarnings("unused")
		double celcius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celcius + " in Celsius");
	}
}
