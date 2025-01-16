package chapter6;

import java.util.Scanner;

public class Lab6Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Username: ");
		String username = scanner.nextLine();

		System.out.print("Password: ");
		String password = scanner.nextLine();

		System.out.println("Username = " + username);
		System.out.println("Password = " + password);

		if (username.equals("thinhgangg") && password.length() > 6) {
			System.out.println("OK");
		}

		scanner.close();
	}
}

//length(): lấy độ dài của chuỗi
//trim(): bỏ đi dấu space đầu/cuối của chuỗi
//toLowerCase(): viết thường tất cả ký tự
//toUpperCase(): viết hoa tất cả ký tự
//substring(): cắt chuỗi thành chuỗi con