import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int numero = 10;
		double numeroComVirgula = 10.78945;
		System.out.print("Olá, mundo! ");
		System.out.println("Bom dia!");
		System.out.println(numero);
		System.out.println(numeroComVirgula);
		System.out.printf("%.2f%n", numeroComVirgula);
		System.out.printf("%.2f\n", numeroComVirgula);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", numeroComVirgula);
		
		System.out.println("Resultado: "+ numero +" metros.");
		System.out.printf("Resultado: %d metros.\n", numero);
		
		String nome = "Brenda";
		int idade = 18;
		double altura = 1.65;
		
		System.out.printf("O nome dela é %s, tem %d anos e mede %.2f de altura.\n", nome, idade, altura);
		
	}

}
