public class Triangle {
	private TriangleTypes type;
	private double x, y, z;

	public Triangle (double side1, double side2, double side3){
		this.x = side1;
		this.y = side2;
		this.z = side3;
		calculateType();
	}

	public TriangleTypes getType() {
		return type;
	}

	private void calculateType(){
		if (!checkIfValid(this.x, this.y, this.z)) {
			this.type = TriangleTypes.INVALID;
			System.err.println("The sum of 2 sides must be greater than the third side. Please try again.");
			return;
		}
		if (x == y && y == z && z == x){
			this.type = TriangleTypes.EQUILATERAL;
			return;
		} else if (x != y && y != z && z != x){
			this.type = TriangleTypes.SCALENE;
			return;
		} else {
			this.type = TriangleTypes.ISOCELES;
		}
	}

	public static TriangleTypes calculateType(double a, double b, double c){
		TriangleTypes type;
		if (!checkIfValid(a, b, c)) {
			type = TriangleTypes.INVALID;
			System.err.println("The sum of 2 sides must be greater than the third side. Please try again.");
		}
		if (a == b && b == c && c == a){
			type = TriangleTypes.EQUILATERAL;
		} else if (a != b && b != c && c != a){
			type = TriangleTypes.SCALENE;
		} else {
			type = TriangleTypes.ISOCELES;
		}
		return type;
	}

	/* Check if triangle is valid according to Inequality Theorem */
	private static boolean checkIfValid(double x, double y, double z) {
		if (x + y <= z || x + z <= y && y + z <= x) {
			return false;
		}
		return true;
	}
}