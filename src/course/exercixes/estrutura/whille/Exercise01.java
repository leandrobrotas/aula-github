package course.exercixes.estrutura.whille;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter with password: ");
		int senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.print("Enter with password: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");

		sc.close();
	}

}
