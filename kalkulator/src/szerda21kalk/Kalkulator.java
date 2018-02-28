package szerda21kalk;

import java.util.Scanner;

public class Kalkulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("kerem adja meg az 1. operandust!");
		System.out.println("1.operandus:");
		double elso_operandus = bemenet.nextDouble();
		
		System.out.println("kerem adja meg az 2. operandust!");
		System.out.println("2.operandus:");
		double masodik_operandus = bemenet.nextDouble();
		
		System.out.println("kerem adja meg az operatort!");
		System.out.println("operator:");
		String operator = bemenet.nextLine();
		operator =bemenet.nextLine();
		
		double eredmeny;
		switch (operator) {
		case "+":
			System.out.println("osszeadas");
			System.out.println(elso_operandus + masodik_operandus);
			break;
			
		case "-":
			eredmeny = elso_operandus - masodik_operandus;
			System.out.println("kivonas:");
			System.out.println(eredmeny);
			break;
			
		case "/":
			eredmeny = elso_operandus / masodik_operandus;
			System.out.println("osztas:");
			System.out.println(eredmeny);
			break;
		case "*":
			eredmeny = elso_operandus * masodik_operandus;
			System.out.println("szorzas");
			System.out.println(eredmeny);
			break;
		default:
			System.out.println("rossz bemenet");
			break;
			
		}

	}

}
