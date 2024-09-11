package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much money do you want to start with?");
		double startAmount = scan.nextDouble();
		System.out.println("What is the win chance?");
		double winChance = scan.nextDouble();
		System.out.println("What is the win limit?");
		double winLimit = scan.nextDouble();
		System.out.println("How many days do you want to play?");
		

		
		
		while (startAmount >= 0 && startAmount <= winLimit) {
			if (Math.random() >= winChance) {
			    startAmount = startAmount + 1;
			}
			
			else {
				startAmount = startAmount - 1;
			}
		}
		
		
		if (startAmount >= winLimit) {
		    System.out.println("Success!");
		}
		
		else {
			System.out.println("Ruin!");
		}
		
		
		
		
			
		
	
		

			
			

	}

}
