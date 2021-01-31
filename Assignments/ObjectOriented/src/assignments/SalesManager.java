package assignments;

public class SalesManager extends Manager{
	
	int commission;
	public SalesManager(String name, int id, int age, int homeallowence, int pf, int allowence, int commission) {
		super(name, id, age, homeallowence, pf, allowence);
		// TODO Auto-generated constructor stub
		this.commission=commission;
	}
	
	
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}

	@Override
	//salary function
			int calculateSalary(){
				return getHomeallowence()+getPf()+getAllowence()+ getCommission() ;
			}

}
