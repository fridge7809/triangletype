import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("--Triangle Type Program--");
		
		// Gather and validate user input
		do {
			try {
				System.out.println("Please type the length of the 3 sides");
				for (int i = 0; i < 3; i++) {
					System.out.println("Side " + (i + 1) + 	": ");
					double side = input.nextDouble();
					validateSide(side);
					switch (i) {
						case 0:
							x = side;
							break;
						case 1:
							y = side;
							break;
						case 2:
							z = side;
							break;
					}
				}
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
				input.nextLine();
			}
		} while (true);
		input.close();
		
		// Instance
		Triangle t = new Triangle(x, y, z);
		System.out.println(t.getType());

		// Static usage
		// System.out.println(Triangle.calculateType(x, y, z));
	}
	
	private static void validateSide(double side) throws Exception {
		if (side <= 0) {
			throw new Exception("Invalid input. Please enter a valid number greater than 0.");
		}
	}
}