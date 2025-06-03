import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Digite seu nome: ");
		palavra = sc.next();
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		System.out.println("Digite seu sexo: ");
		sexo = sc.next().charAt(0);
		
		System.out.println("Seu nome: " + palavra);
		System.out.println("Sua idade: " + idade);
		System.out.println("Sua altura: " + altura);
		System.out.println("Seu sexo: " + sexo);
		
		sc.close();

	}

}
