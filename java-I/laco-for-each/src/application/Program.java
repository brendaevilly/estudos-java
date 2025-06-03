package application;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] {"Brenda", "Brenno", "Merces", "Erismar"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//laço for eich
		System.out.println("------------------------");
		//Tipo da coleção, apelido, nome da coleção.
		for(String elementos : vect) {
			System.out.println(elementos);
		}

	}

}
