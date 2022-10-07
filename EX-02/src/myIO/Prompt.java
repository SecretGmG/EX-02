package myIO;

import java.util.Scanner;

public class Prompt {
	public static int PromptInt(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextInt();
	}
	public static double PromptDouble(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextDouble();
	}
	public static String PromptString(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.next();
	}	
}
