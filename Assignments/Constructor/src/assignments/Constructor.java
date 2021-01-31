package assignments;

public class Constructor {
	int one;
	int two;
//	Constructor(){
//		System.out.println("Contructor Initialised");
//	}
	
	Constructor(int a, int b){
		one=a;
		two=b;
	}
	public static void main(String[] args) {

		Constructor obj =  new Constructor(3,5);
		System.out.println(obj.one);
		System.out.println(obj.two);
	}

}
