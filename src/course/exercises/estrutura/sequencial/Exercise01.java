package course.exercises.estrutura.sequencial;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o primeiro n�mero");
		int n1 = sc.nextInt();
		System.out.println("Entre com o segundo n�mero");
		int n2 = sc.nextInt();
		System.out.printf("SOMA = %d", n1 + n2);

		sc.close();

	}

}
