package chapter9;

import java.util.Scanner;

public class Lab9Bai1 {
	private static final Scanner scanner = new Scanner(System.in);

	public static int NhapMaSV() {
		int id;
		while (true) {
			System.out.print("Nhập mã sinh viên: ");
			try {
				id = scanner.nextInt();
				scanner.nextLine();
				break;
			} catch (Exception e) {
				System.out.println("Mã sinh viên không hợp lệ!");
				scanner.next();
			}
		}
		return id;
	}

	public static String NhapTen() {
		String name;
		while (true) {
			System.out.print("Nhập tên: ");
			name = scanner.nextLine();

			if (name.matches("[a-zA-Z\\s]+")) {
				break;
			} else {
				System.out.println("Tên chỉ được chứa chữ cái và khoảng trắng!");
			}
		}
		return name;
	}

	public static double NhapDiem() {
		double score;
		while (true) {
			System.out.print("Nhập điểm: ");
			try {
				score = scanner.nextDouble();
				if (score >= 0 && score <= 10) {
					scanner.nextLine();
					break;
				} else {
					System.out.println("Điểm phải nằm trong khoảng từ 0 đến 10!");
				}
			} catch (Exception e) {
				System.out.println("Điểm không hợp lệ!");
				scanner.next();
			}
		}
		return score;
	}

	public static int NhapTuoi() {
		int age;
		while (true) {
			System.out.print("Nhập tuổi: ");
			try {
				age = scanner.nextInt();
				if (age >= 0 && age <= 100) {
					scanner.nextLine();
					break;
				} else {
					System.out.println("Tuổi phải nằm trong khoảng từ 0 đến 100!");
				}
			} catch (Exception e) {
				System.out.println("Tuổi không hợp lệ!");
				scanner.next();
			}
		}
		return age;
	}

	public static void main(String[] args) {
		int ID = NhapMaSV();
		String name = NhapTen();
		double score = NhapDiem();
		int age = NhapTuoi();
		SinhVien sv = new SinhVien(ID, name, score, age);
		System.out.println(sv);
	}
}
