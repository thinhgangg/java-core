package chapter2;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>LỰA CHỌN TÍNH NĂNG<<");
		System.out.println("++------------------++");
		System.out.println("|1. Cộng             |");
		System.out.println("|2. Trừ              |");
		System.out.println("|3. Kết thúc         |");
		System.out.println("++------------------++");
		System.out.printf("Lựa chọn của bạn là: ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Bạn đã lựa chọn phép cộng");
			break;
		case 2:
			System.out.println("Bạn đã lựa chọn phép trừ");
			break;
		default:
			System.exit(0);
		}

		scanner.close();
	}
}
