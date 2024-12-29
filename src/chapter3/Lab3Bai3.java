package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int size = scanner.nextInt();

		int[] a = new int[size];
		System.out.println("Nhập phần tử của mảng: ");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Mảng ban đầu: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Mảng sắp xếp: " + Arrays.toString(a));

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}
		System.out.println("Max = " + max);

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println("Min = " + min);

//		for (int i : a) {
//			System.out.print(i + " ");
//		}
		scanner.close();
	}
}
