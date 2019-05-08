package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import course.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int j = 1; j <= n; j++) {
			System.out.println();
			System.out.println("Emplyoee #" + j + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			employees.add(new Employee(id, name, salary));
		}
//      Solução aplicada pelo professor
		
		
//		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//
//		if (emp == null) {
//
//			System.out.println("This id does not exist!");
//
//		}
//
//		else {
//
//			System.out.print("Enter the percentage: ");
//
//			double percentage = sc.nextDouble();
//
//			emp.increaseSalary(percentage);
//
//		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		for (int i = 0; i < employees.size(); i++) {
			Employee currentEmployee = employees.get(i);
			if (currentEmployee.getId() == id) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				currentEmployee.increaseSalary(percentage);
			} else if (i == employees.size() - 1) {
				System.out.println("This id does not exist!");
			}
		}

		System.out.println();
		System.out.println("List of employees: ");

		for (Employee e : employees) {
			System.out.println(e);
		}

		sc.close();
	}
}
