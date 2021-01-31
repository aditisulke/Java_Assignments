package assignments;
import static java.lang.Math.PI;

public class AreaOfTriangle {
		int b,h;
		
		AreaOfTriangle(int base, int height){
			this.b=base;
			this.h=height;
	}
		
		double calculateArea() {
			System.out.println("base :"+b+"height"+h);
			return (double)b*h*0.5;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaOfTriangle a = new AreaOfTriangle(20,40);
		double area = a.calculateArea();
		System.out.println("Area of Triangle "+area);
		
	}

}
