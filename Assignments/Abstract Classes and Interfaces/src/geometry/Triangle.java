package geometry;

public class Triangle extends Shapes {

	int l;
	int b;
	
	Triangle(){
	 l=3;
	 b=3;
		
	}
	
	
	@Override
	double area() {
		System.out.println("Area of Triangl :" );
		double result = ((0.5)*l*b);
		return result;
	}
}
