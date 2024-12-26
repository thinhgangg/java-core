package chapter2;

import java.util.Scanner;

public class Lab2Bai3 {
	public static void main(String[] args) {
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
}
