package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void status() {
		if(finalGrade() >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			double aux = 60 - finalGrade();
			System.out.printf("MISSING %.2f POINTS%n", aux);
		}
	}
}
