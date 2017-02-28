package betaben.wordpractice;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter your name:");
		String input = scanner.next();
		if(input.toUpperCase().equals("EXIT")){
			System.out.println("You win!");
		} else{
			System.out.println("Hello " + input + "!");
		}
	}
}