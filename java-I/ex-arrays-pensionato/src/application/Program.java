package application;

import java.util.Scanner;
import entities.Students;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented: ");
		int roonsRented = sc.nextInt();
		System.out.println();
		
		Students[] studentsArray = new Students[10];
		
		for(int i=0; i<roonsRented; i++) {
			System.out.printf("Rent #%d:", i+1);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String eMail = sc.nextLine();
			System.out.println("Room: ");
			int roomNumber = sc.nextInt();
			studentsArray[roomNumber] = new Students(name, eMail, roomNumber);
		}
		
		System.out.println("Busy rooms:");
		for(int i=0; i<studentsArray.length; i++) {
			if(studentsArray[i] != null) {
				System.out.printf("%d: %s, %s%n", i, studentsArray[i].getName(), studentsArray[i].geteMail());
			}
		}
		
		sc.close();

	}

}
