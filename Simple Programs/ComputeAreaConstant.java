package Areas;
  import java.util.Scanner;
  
 @SuppressWarnings("unused")
public class ComputeAreaConstant {
	public static void main(String[] args) {
		final double PI = 3.14159;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for a radius:  ");
		double radius = input.nextDouble();
        double area = radius * radius * PI;
        
        System.out.println("The area for the circle of radius " + radius  + area);

	 }
    }
