//Zaid Abu Jumaiza - CS113-004

public class Employee2and3 {

	private final String name;
	private final String address;
	private final String phone;
	private final String socialSecurityNumber;
	private double rate;

	public Employee2and3(String n, String a, String p, String social, double r) {

		name = n;
		address = a;
		phone = p;
		socialSecurityNumber = social;
		rate = r;
	
	}

	public void setRate(double r) {
		rate = r;
	}

	public String getName() {

		return name;

	}

	public String getPhone() {

		return phone;

	}

	public String getSocialSecurityNumber() {

		return socialSecurityNumber;

	}

	public String getAddress() {

		return address;

	}

	public double pay() {

		return rate;

	}

}
