package chapter2;

import java.util.Scanner;

public class Lab2Bai4 {
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

	public static void bai1() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("a = ");
		int a = scanner.nextInt();
		System.out.printf("b = ");
		int b = scanner.nextInt();
		PhuongTrinhBacNhat(a, b);
		scanner.close();
	}

	public static void bai2() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
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

	public static void bai3() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số điện: ");
		int sodien = scanner.nextInt();

		if (sodien <= 100) {
			int sotien = sodien * 1000;
			System.out.println("So tien: " + sotien + "VND");
		} else {
			int sotien = 100 * 1000 + (sodien - 100) * 1500;
			System.out.println("So tien: " + sotien + "VND");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>>>>>>>LỰA CHỌN TÍNH NĂNG<<<<<<<<");
		System.out.println("+--------------------------------+");
		System.out.println("| 1. Giải phương trình bậc nhất  |");
		System.out.println("| 2. Giải phương trình bậc hai   |");
		System.out.println("| 3. Tính số tiền điện           |");
		System.out.println("| 4. Kết thúc                    |");
		System.out.println("+--------------------------------+");
		System.out.printf("Lựa chọn của bạn: ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			bai1();
			break;
		case 2:
			bai2();
			break;
		case 3:
			bai3();
			break;
		case 4:
			System.out.println(">> Bạn đã thoát chương trình <<");
			System.exit(0);
		default:
			System.out.println("Error!");
		}
		scanner.close();
	}
}
