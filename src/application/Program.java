package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List <Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products :");
		
		for (int i = 1; i<= 1; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported ? c/u/i");
			char c = sc.next().charAt(0);
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Price:");
			double price = sc.nextDouble();
			
			if (c == 'c') {
				list.add(new Product(name, price));
			}
			else if (c == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
	}

}
