package course.exercixes.estrutura.forr;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1;
		int in = 0;
		int out = 0;
		for (int i = 1; i <= n; i++) {
			n1 = sc.nextInt();
			if (n1 >= 10 && n1 <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
