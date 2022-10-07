package passwords;

import java.util.Random;
import myIO.Prompt;

public class PasswordGenerator {

	public static void main(String[] args) {
		String firstName = Prompt.PromptString("Please enter your first name");
		String lastName = Prompt.PromptString("Please enter your last name");
		System.out.println(
				"Here is your automatically generated Password:\n" +
				GenerateFromFullName(firstName, lastName)
			);
	}
	
	public static String GenerateFromFullName(String firstName, String lastName) {
		
		//Early return to avoid an out of bounds error
		//To keep it simple I decided to return an empty String
		//Another option would have been to throw an error,
		//or generate a password with another procedure
		if(firstName.length() < 1 || lastName.length() < 5) {
			System.out.println("first or lastName is not long enough, an empty string was generated!");
			System.out.println("try entering a last name at least 5 characters long");
			return "";
		}
				
		StringBuilder password = new StringBuilder();
		
		password.append(firstName.charAt(0));
		for(int i = 0; i<5; i++) {
			password.append(lastName.charAt(i));
		}
		Random rand = new Random();
		
		password.append(rand.nextInt(1000));
		
		return password.toString();
	}
	

}
