package practice.java8;

public class Employee2 {

	private String name;
	
	private String city;
	
	private int age;

	private int salary;
	
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", city=" + city + ", age=" + age + ", salary=" + salary + ", isActive="
				+ isActive + "]";
	}

	public Employee2(String name, String city, int age, int salary, boolean isActive) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}
	
	
	
	
	
}
