package chapter9;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int x = scanner.nextInt();
			System.out.println("run try");
		} catch (Exception e) {
			System.out.println("run catch");
		} finally {
			System.out.println("run finally");
			scanner.close();
		}
	}
}
