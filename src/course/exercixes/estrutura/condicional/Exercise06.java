package course.exercixes.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code;
		int quantity;
		double total = 0;
		code = sc.nextInt();
		quantity = sc.nextInt();

		if (code == 1) {
			total = quantity * 4.0;
		} else if (code == 2) {
			total = quantity * 4.5;
		} else if (code == 3) {
			total = quantity * 5.0;
		} else if (code == 4) {
			total = quantity * 2.0;
		} else {
			total = quantity * 1.5;
		}
		System.out.printf("Total: R$ %.2f", total);
		sc.close();
	}

}
