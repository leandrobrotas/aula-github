package course.exercixes.estrutura.forr;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fatorial = 1;
		for (int i = n; i > 1; i--) {
			fatorial *= i;
		}
		System.out.println(fatorial);
		sc.close();
	}

}
