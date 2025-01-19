package chapter9;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("nhap x = ");
				int x = scanner.nextInt();
				try {
					System.out.println("10/x = " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println("error with x = 0");
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("error with x = char");
			}

		}

		scanner.close();
	}
}
