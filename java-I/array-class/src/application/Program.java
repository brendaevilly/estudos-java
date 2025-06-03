package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tam = sc.nextInt();
		Product[] productArray = new Product[tam];
		String name = null;
		double price = 0.0;
		double media, soma = 0.0;
		
		for(int i=0; i<productArray.length; i++) {
			sc.nextLine();
			name = sc.nextLine();
			price = sc.nextDouble();
			productArray[i] = new Product(name, price);
			soma += productArray[i].getPrice();
		}
		
		media = soma/3;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", media);
		
		sc.close();

	}

}
