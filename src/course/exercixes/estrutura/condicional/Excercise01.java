package course.exercixes.estrutura.condicional;

import java.util.Scanner;

public class Excercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		sc.close();
	}

}
