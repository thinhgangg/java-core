package chapter3;

import java.util.Scanner;

public class Lab3Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên n: ");
		int n = scanner.nextInt();

		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Ước số khác: " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(n + " là số nguyên tố");
		} else {
			System.out.println(n + " không là số nguyên tố");
		}
		scanner.close();
	}
}
