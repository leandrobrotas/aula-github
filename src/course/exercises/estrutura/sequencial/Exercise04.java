package course.exercises.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number, workedHour;
		double salaryByHour, salary;

		number = sc.nextInt();
		workedHour = sc.nextInt();
		salaryByHour = sc.nextDouble();
		salary = workedHour * salaryByHour;
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f", salary);
		sc.close();

	}
}
