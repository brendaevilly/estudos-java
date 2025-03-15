package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Java");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		sc.close();
	}

}
