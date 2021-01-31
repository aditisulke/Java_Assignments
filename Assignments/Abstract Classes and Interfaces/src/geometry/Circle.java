package geometry;

public class Circle extends Shapes{
	int r;
	
	Circle(){
		r=5;
	}
	
	@Override
	double area() {
		
		System.out.println("Area of Circle :");
		
		double result = (Math.PI*r*r);
		return result;
	}
}
