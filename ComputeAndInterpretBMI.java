package SimplePrograms;
import java.util.*;

@SuppressWarnings("unused")
public class ComputeAndInterpretBMI {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds:   ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches:   ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237; // constant
		final double METERS_PER_INCH = 0.0254; //constant
		
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms /
	      (heightInMeters * heightInMeters);
		
		//Display result
		System.out.println("BMI is" + bmi);
		if (bmi < 18.5)
	    System.out.println("You are Underweight");
		else if (bmi < 25)
		System.out.println("You are Normal");
		else if (bmi < 30)
		System.out.println("You are Overweight");
		else
	    System.out.println("You are obese. Go Workout");
	   	}

}
