package course.exercises.estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code1, quantity1, code2, quantity2;
		double price1, price2, total;
		code1 = sc.nextInt();
		quantity1 = sc.nextInt();
		price1 = sc.nextDouble();

		code2 = sc.nextInt();
		quantity2 = sc.nextInt();
		price2 = sc.nextDouble();

		total = price1 * quantity1 + price2 * quantity2;

		System.out.printf("Valor a pagar = %.2f", total);
		sc.close();
	}
}
