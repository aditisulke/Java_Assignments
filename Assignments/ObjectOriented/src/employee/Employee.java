package employee;

public class Employee {

	private String name;
	private int id;
	private String city;
	
	Employee(){
		this.name = null;
		
		this.city = null;
	}
	
	public Employee(int id2, String name, String city) {
		this.name = name;
		this.city = city;
		this.id = id2;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Employee [name " +name+ "id" +id+ "city"+city+ "]";
		
	}
}
