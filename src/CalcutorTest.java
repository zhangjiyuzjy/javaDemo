import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcutorTest {
    @Test
    public void shouldeReturn2when1Plus1(){
        Calcutor calcutor = new Calcutor();
        int acuResult = calcutor.cumpute(1, 1, '+');
        int expResult = 2;
        Assert.assertEquals(expResult, acuResult);
    }

    @Test
    public void shouldeReturn2when1Sub1(){
        Calcutor calcutor = new Calcutor();
        int acuResult = calcutor.cumpute(1, 1, '-');
        int expResult = 0;
        Assert.assertEquals(expResult, acuResult);
    }
}