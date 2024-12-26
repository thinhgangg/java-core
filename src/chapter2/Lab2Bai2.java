package chapter2;

import java.util.Scanner;

public class Lab2Bai2 {
	public static void PhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			Float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.3f", x);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("a = ");
		int a = scanner.nextInt();
		System.out.printf("b = ");
		int b = scanner.nextInt();
		System.out.printf("c = ");
		int c = scanner.nextInt();

		if (a == 0) {
			PhuongTrinhBacNhat(b, c);
		} else {
			System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x = %.3f", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm phân biệt: x1 = %.3f, x2 = %.3f", x1, x2);
			}
		}

		scanner.close();
	}
}
