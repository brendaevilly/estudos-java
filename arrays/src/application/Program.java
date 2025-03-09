package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tam = sc.nextInt();
		double[] array = new double[tam];
		double soma = 0.0;
		
		for(int i=0; i<3; i++) {
			array[i] = sc.nextDouble();
			soma += array[i];
		}
		
		double media = soma/3;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", media);
		
		sc.close();
		

	}

}
