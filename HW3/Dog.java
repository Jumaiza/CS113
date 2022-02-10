//Zaid Abu Jumaiza CS113004

public class Dog {
	
	private String dogName;
	private int dogAge;
	
	public Dog() {
		dogName = "dog";
		dogAge = 0;
	}

	public String getName() {
		return dogName;
	}
	
	public int getAge() {
		return dogAge;
	}
	
	public void setName(String name) {
		dogName = name;
	}
	
	public void setAge(int age) {
		dogAge = age;
	}
	
	public int toPersonYears() {
		int years = (dogAge*7);
		return years;
	}
	
	public String toString() {
		String info = dogName+" is "+dogAge+" years old.";
		return info;
	}
}
