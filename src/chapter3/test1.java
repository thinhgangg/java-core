package chapter3;

import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		int[] a = { 1, 5, 2, 10, 6, 3, 7, 4 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
