package geometry;

public class MainClass {
	public static void main( String args[]) {
		
		Shapes sh = new Triangle();
		System.out.println(sh.area());
		
		Shapes sa = new Circle();
		System.out.println(sa.area());
		
		Shapes sp = new Rectangle();
		System.out.println(sp.area());
	}

}
