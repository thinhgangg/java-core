package chapter3;

public class test {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		int j = 0;
		while (j < 5) {
			System.out.print(j);
			j++;
		}
		System.out.println();
		int k = 0;
		do {
			System.out.print(k);
			k++;
		} while (k < 5);
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.print(i);
		}
	}
}
