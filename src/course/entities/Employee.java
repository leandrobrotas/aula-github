package course.entities;

public class Employee {

	Integer id;
	String name;
	Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		salary += salary * (percentage / 100);
	}

	public String toString() {
		return this.getId() + ", " + this.getName() + ", " + String.format("%.2f", getSalary());
	}
}
