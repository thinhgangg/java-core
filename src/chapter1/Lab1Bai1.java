package chapter1;

import java.util.Scanner;

public class Lab1Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();

		System.out.println("Nhập điểm trung bình: ");
		int score = scanner.nextInt();

		System.out.println(name + " có điểm = " + score);

		scanner.close();
	}
}
