package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		while (true) {
			System.out.print("Nhập 1 số bất kỳ: ");
			Double input = scanner.nextDouble();
			list.add(input);
			scanner.nextLine();
			System.out.print("Continue ? Y or N ");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}

		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("Tổng = " + sum);

		scanner.close();
	}
}

//add: thêm phần tử vào cuối
//remove: xóa phần tử
//clear: xóa tất cả
//get: lấy phần tử tại vị trí
