package question7;

public class Person {
	private String name;
	private int homeNo;
	private int workNo;
	private int mobileNo;

	public Person(String name, int homeNo, int workNo, int mobileNo){
		this.name = name;
		this.homeNo = homeNo;
		this.workNo = workNo;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(int homeNo) {
		this.homeNo = homeNo;
	}

	public int getWorkNo() {
		return workNo;
	}

	public void setWorkNo(int workNo) {
		this.workNo = workNo;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
}
