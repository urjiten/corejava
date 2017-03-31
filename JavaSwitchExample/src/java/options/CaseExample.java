package java.options;

import java.util.Scanner;

public class CaseExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your grade..");
		s.close();

		String grade = s.next();

		switch (grade) {

		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("very good");
			break;
		case "C":
			System.out.println("well done");
			break;

		case "D":
			System.out.println("You have Passed");
			break;
		case "E":
			System.out.println("You have improve");
			break;

		default:

		}

		System.out.println("Your grade is " + grade);

	}

}
