package assignments;

public class Employee {
	private String name;
	private int age;
	
	//default constructor must be created to avoid confusion of garbage value
	public Employee(){
		this.name = null;
		this.age=0;	
	}
	public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    
    public void setAge(int age) {
    	this.age=age;
    }
    public int getAge() {
    	return this.age;
    }
    
    public static void main(String args[]) {
    	Employee obj = new Employee();
    	obj.setName("Aditi");
    	obj.setAge(23);
    	System.out.println(obj.getName());
    	System.out.println(obj.getAge());
    	
    }
    
}
