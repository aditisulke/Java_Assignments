package employee;

public class EmployeeDao {
	static int count = 0;
	
	Employee[] emp = new Employee[10];
	static int increment() {
		return count++;
	}
	
	void addEmp(String name,String city) {
		int id= EmployeeDao.increment();
		emp[id] = new Employee(id,name,city);
	}
	
	void display() {
		for(int i=0; i<EmployeeDao.count; i++){
			System.out.println(emp[i]);
		}
	}
}
