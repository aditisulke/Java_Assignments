package assignments;

public class TestDataBreak {

	public static void main(String[] args) {
		int num=123456;
		int rem;
		
		for(int i=5;i>=0;i++) {
			rem=(int) (num/Math.pow(10, i));
			System.out.println(rem+" ");
			num%=Math.pow(10, 1);
		}
	}

}
