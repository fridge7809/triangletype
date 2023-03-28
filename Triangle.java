public class Triangle {
	private TriangleTypes type;
	private double x, y, z;

	public Triangle (double side1, double side2, double side3){
		this.x = side1;
		this.y = side2;
		this.z = side3;
		calculateType();
		System.out.println(type);
	}

	public void calculateType(){
		this.type = null;
		//TODO flyt check til input
		if (x + y <= z || x + z <= y && y + z <= x){
			System.err.println("not a triangle");
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
		//flyt check til input
		if (a + b <= c || a + c <= b && b + c <= a){
			System.err.println("not a triangle");
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

	// TODO fjern error handling
	public String getType(){
		String s = null;
		try {
		switch (type) {
			case EQUILATERAL:
				s = "Triangle is Equilateral";
				break;
			case SCALENE:
				s = "Triangle is Scalene";
				break;
			case ISOCELES:
				s = "Isoceles";
				return s;
			}
		return s;
		} catch (NullPointerException e) {
			s = e.getMessage();
			return s;
		}
	}
}