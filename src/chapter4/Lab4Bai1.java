package chapter4;

public class Lab4Bai1 {
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.nhapThongTin();
		System.out.println("--------------------");
		product1.xuatThongTin(product1);
		System.out.println("TAX = " + product1.getTaxPrice(product1.getPrice(), product1.getTax()));

		System.out.println("====================");

		Product product = new Product();
		Product product2 = product.nhapThongTin("computer", 200, 0.2);
		product.xuatThongTin(product2);
		System.out.println("TAX = " + product.getTaxPrice(product2.getPrice(), product2.getTax()));
	}
}
