package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		
		//list.remove(1);
		
		
		//list.remove("Anna");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Brenda"));
		
		System.out.println("-------------------------");
		//Filtrar os nomes que começam com A para outra lista(result). O tipo stream recebe expressões do tipo Lambda. Função filter para filtrar.
		//collect(Collectors.toList()) é para passar do tipo stream para o tipo list, pois n são compatíveis.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
				
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
				
	}

}
