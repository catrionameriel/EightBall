import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EightBallTest {

    EightBall magicEightBall;

    @Before
    public void before(){
        magicEightBall = new EightBall();
        magicEightBall.addAnswer("Yes, definitely");
        magicEightBall.addAnswer("The outlook is good");
        magicEightBall.addAnswer("As I see it, yes");
    }

//    @Test
//    public void hasNoAnswers(){
//        assertEquals (0, magicEightBall.countAnswers());
//    }

    @Test
    public void hasAnswersAdded(){
        assertEquals(3, magicEightBall.countAnswers());
    }


}
