package assignments;

public class Employee {
	 
	private String name;
	private int id;
	private int age;
	private int homeallowence;
	private int pf;

	
	public Employee(String name2, int id2, int age2, int homeallowence2, int pf2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
		this.id = id2;
		this.age = age2;
		this.homeallowence = homeallowence2;
		this.pf = pf2;
	}


	Employee() {
		this.name = null;
		this.id = 0;
		this.age = 0;
		this.homeallowence = 0;
		this.pf = 0;
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getHomeallowence() {
		return homeallowence;
	}


	public void setHomeallowence(int homeallowence) {
		this.homeallowence = homeallowence;
	}


	public int getPf() {
		return pf;
	}


	public void setPf(int pf) {
		this.pf = pf;
	}

	//salary function
		int calculateSalary(){
			return getHomeallowence()+getPf();
		}


}
