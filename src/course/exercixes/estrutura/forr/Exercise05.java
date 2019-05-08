package course.exercixes.estrutura.forr;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <=n;i++) {
			double divisor = sc.nextInt();
			double denominador = sc.nextInt();
			if (denominador == 0) {
			System.out.println("divisao impossivel");
		} else {
			double resultado = divisor / denominador;
			System.out.println(resultado);
			}
		}
		sc.close();
	}

}
