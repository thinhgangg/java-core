package chapter1;

import java.util.Scanner;

public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập độ dài cạnh của khối lập phương: ");
		int canh = scanner.nextInt();

		double thetich = Math.pow(canh, 3);
		System.out.println("Thể tích của khối lập phương là: " + thetich);
		scanner.close();
	}
}
