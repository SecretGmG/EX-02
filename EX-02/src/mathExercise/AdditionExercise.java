package mathExercise;
import java.util.Random;

public class AdditionExercise {	
	
	public static void main(String[] args) {
		
		IntQuestionAnswerPair additionProblem = GetAdditionProblem(21); //the bound is exclusive
		
		if(additionProblem.Prompt()) {
			System.out.println("Good Job!");
		}
		else {
			System.out.println(
					String.format("Wrong! the correct answer would have been %s", additionProblem.answer)
					);
		}
	}
	
	public static IntQuestionAnswerPair GetAdditionProblem(int bound) {
		Random rand = new Random();
		int a = rand.nextInt(bound);
		int b = rand.nextInt(bound-a);
		
		//for any a,   b < bound-a
		//therefore  a+b < a+bound-a 
		//therefore  a+b < bound
				
		IntQuestionAnswerPair additionProblem = new IntQuestionAnswerPair();
		
		additionProblem.question = String.format("Please calculate %d + %d",a, b);
		additionProblem.answer = a+b;
		
		return additionProblem;		
	}
}
