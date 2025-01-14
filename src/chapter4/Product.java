package chapter4;

import java.util.Scanner;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product() {
	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		this.name = sc.next();
		System.out.print("Enter Price: ");
		this.price = sc.nextDouble();
		System.out.print("Enter Tax: ");
		this.tax = sc.nextDouble();
		sc.close();
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public void xuatThongTin(Product pr) {
		System.out.println("Name : " + pr.getName());
		System.out.println("Price: " + pr.getPrice());
		System.out.println("Tax  : " + pr.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}
}
