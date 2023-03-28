/**
 * Main
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// TODO validate user input and check if triangle
		Scanner input = new Scanner(System.in);
		System.out.println("--Triangle Type Program--");
		System.out.println("Please type the length of the 3 sides");
		System.out.print("Side 1: ");
		double x = input.nextDouble();
		System.out.print("Side 2: ");
		double y = input.nextDouble();
		System.out.print("Side 3: ");
		double z = input.nextDouble();
		input.close();

		//instantiate shape
		Triangle s = new Triangle(x, y, z);
		System.out.println(s.getType());
	}
}