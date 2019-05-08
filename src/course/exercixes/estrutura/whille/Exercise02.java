package course.exercixes.estrutura.whille;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		int alcool = 0, gasolina = 0, diesel = 0;
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();

		while (type != 4) {
			switch (type) {
			case 1:
				alcool = alcool + 1;
				break;
			case 2:
				gasolina = gasolina + 1;
				break;
			case 3:
				diesel = diesel + 1;
				break;
			}
			type = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		sc.close();
	}

}
