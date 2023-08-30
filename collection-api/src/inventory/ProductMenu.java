package inventory;

import java.io.Console;
import java.util.Scanner;

public class ProductMenu {
	private static ProductJdbcDao dao;
	static {
		dao = new ProductJdbcDao();
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		while (true) {
			System.out.println("Main menu");
			System.out.println("1- Add Product \n2- Find Product \n3- List Products \n4- Delete Products \n5- Exit");
			System.out.println("Enter Choice: ");
			int choice = console.nextInt();
			switch (choice) {
			case 1:
				addProduct();
				break;
			case 2:
				findProduct();
				break;
			case 3:
				listProduct();
				break;
			case 4:
				delProduct();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Option");
			}
		}
	}

	private static void addProduct() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Product Code : ");
		int code = console.nextInt();
		System.out.println("Enter Product Name : ");
		String name = console.next();
		System.out.println("Enter Product Price : ");
		double price = console.nextDouble();

		Product p = new Product(code, name, price);
		dao.add(p);

		// console.close();

	}

	private static void findProduct() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Product Code: ");
		int code = console.nextInt();
		System.out.println(dao.find(code));
		// console.close();

	}

	private static void listProduct() {
		dao.list().forEach(System.out::println);
		

	}

	private static void delProduct() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Product Code: ");
		int code = console.nextInt();
		dao.delete(code);
		// console.close();

	}
}
