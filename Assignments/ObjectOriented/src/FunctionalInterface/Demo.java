package FunctionalInterface;

public class Demo {

	void createClass() {
		InterfaceDetails det = new InterfaceDetails() {
			public void display() {
				System.out.println("Inside Anonymous class");
				
			}
			
		};
		det.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.createClass();
	}

}
