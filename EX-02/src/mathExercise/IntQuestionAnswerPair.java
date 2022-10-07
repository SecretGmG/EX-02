package mathExercise;
import myIO.Prompt;

public class IntQuestionAnswerPair{
	public String question;
	public int answer;
	
	//Asks the user the question and compares it to the result
	public boolean Prompt() {
		return answer == Prompt.PromptInt(question);
	}
}
