package SimplePrograms;
import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
	 @SuppressWarnings({ "unused", "resource" })
	Scanner input = new Scanner(System.in);
	 System.out.print("Enter an integer for seconds: ");
	 @SuppressWarnings("unused")
	int seconds = input.nextInt();
	 @SuppressWarnings("unused")
	int minutes = seconds / 60; //Finds the minutes in seconds
	 @SuppressWarnings("unused")
	int remainingSeconds = seconds % 60; //Seconds remaining until a set timer
    System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}

}
