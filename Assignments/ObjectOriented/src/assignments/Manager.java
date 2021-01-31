package assignments;

public class Manager extends Employee {
	int allowence;
	
	public Manager(String name2, int id2, int age2, int homeallowence2, int pf2,int allowence) {
		super(name2, id2, age2, homeallowence2, pf2);
		this.allowence=allowence;
		// TODO Auto-generated constructor stub
		
	}

	
	
	public int getAllowence() {
		return allowence;
	}
	public void setAllowence(int allowence) {
		this.allowence = allowence;
	}

	@Override
	//salary function
			int calculateSalary(){
		
				return getHomeallowence()+getPf()+getAllowence();
			}

}
