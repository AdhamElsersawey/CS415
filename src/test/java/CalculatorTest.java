import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest(){
        assertEquals(3, Calculator.add(1,2));
    }
    @Test
    public void subTest(){
        assertEquals(-1, Calculator.sub(1,2));
    }
    @Test
    public void mulTest(){
        assertEquals(2, Calculator.mul(1,2));
    }
    @Test
    public void divTest(){
        assertEquals(2, Calculator.div(10,5));
    }
}
