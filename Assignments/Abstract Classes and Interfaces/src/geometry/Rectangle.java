package geometry;

public class Rectangle extends Shapes{
	
	int l;
	int b;
	Rectangle() {
		l=4;
		b=4;
	};
	
	
	@Override
	double area() {
		
		System.out.println("Area of Rectangle :");
		
		double result = l*b;
		return result;
	}
}
