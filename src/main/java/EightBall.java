import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    ArrayList<String> answers;

    public EightBall(){
        this.answers = new ArrayList<>();
    }

    public int countAnswers(){
        return this.answers.size();
    }

    public void addAnswer(String phrase){
        this.answers.add(phrase);
    }

    public String getRandomAnswer(){
        Collections.shuffle(this.answers);
    }

}
