package mathExercise;
import java.util.Random;

public class AdditionExercise {	
	
	public static void main(String[] args) {
		
		IntQuestionAnswerPair additionProblem = GetAdditionProblem(20);
		
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
		int b = rand.nextInt(20-a);
		
		int c = a+b;
		
		IntQuestionAnswerPair additionProblem = new IntQuestionAnswerPair();
		
		additionProblem.question = String.format("Please calculate %d + %d",a, b);
		additionProblem.answer = c;
		
		return additionProblem;		
	}
}
