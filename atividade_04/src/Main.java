import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ler um texto até a quebra de linha.
		
		String linha1, linha2, linha3;
		int number;
		
		number = sc.nextInt();
		sc.nextLine(); //sc.nextLine(); para que o linha1 não consuma a quebra de linha do nextInt. Limpa o buffer de leitura.
		linha2 = sc.nextLine();
		linha3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS");
		System.out.println(number);
		System.out.println(linha1);
		System.out.println(linha2);
		System.out.println(linha3);
		
		sc.close();

	}

}
