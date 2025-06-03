
public class Main {

	public static void main(String[] args) {
		String original = "abcd ABDCX aiuy   ";
		
		String str1 = original.toLowerCase();
		String str2 = original.toUpperCase();
		String str3 = original.trim();
		String str4 = original.substring(2);
		String str5 = original.substring(2, 7);
		String str6 = original.replace('a', '$');
		int str7 = original.indexOf('a');
		int str8 = original.lastIndexOf('a');
		
		System.out.println("-" + original + "-");
		System.out.println("-" + str1 + "-");
		System.out.println("-" + str2 + "-");
		System.out.println("-" + str3 + "-");
		System.out.println("-" + str4 + "-");
		System.out.println("-" + str5 + "-");
		System.out.println("-" + str6 + "-");
		System.out.println("-" + str7 + "-");
		System.out.println("-" + str8 + "-");
		
		String name = "Brenda Evilly Oliveira de Moura";
		
		String[] vectName = name.split(" ");
		
		for(int i=0; i<5; i++) {
			System.out.println(vectName[i]);
		}
		
	}

}
