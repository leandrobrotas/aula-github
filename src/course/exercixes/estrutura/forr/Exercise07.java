package course.exercixes.estrutura.forr;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d ", i);
			System.out.printf("%.0f ", Math.pow(i, 2));
			System.out.printf("%.0f%n", Math.pow(i, 3));
		}
		sc.close();
	}
}
