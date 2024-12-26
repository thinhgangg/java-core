package chapter1;

import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chiều dài: ");
		int dai = scanner.nextInt();

		System.out.println("Nhập chiều rộng: ");
		int rong = scanner.nextInt();

		int chuvi = (dai + rong) * 2;
		int dientich = dai * rong;

		System.out.println("Chu vi hình chữ nhật là: " + chuvi);
		System.out.println("Diện tích hình chữ nhật là: " + dientich);
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + Math.min(dai, rong));

		scanner.close();
	}
}
