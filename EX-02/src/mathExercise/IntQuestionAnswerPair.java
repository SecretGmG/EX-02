package mathExercise;
import myIO.Prompt;

public class IntQuestionAnswerPair{
	public String question;
	public int answer;
	
	
	public boolean Prompt() {
		return answer == Prompt.PromptInt(question);
	}
}
