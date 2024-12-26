package chapter2;

import java.util.Scanner;

//ax + b = 0
public class Lab2Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("a = ");
		int a = scanner.nextInt();
		System.out.printf("b = ");
		int b = scanner.nextInt();

		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			Float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.3f", x);
		}

		scanner.close();
	}
}
