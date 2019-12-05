package poly;

import org.junit.Test;
import java.util.function.DoubleUnaryOperator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Task1 {

    @Test
    public void testString1() {
        Poly p = PolyFactory.parse("X^7 + 10 * X^5 - 1 * X^7");
        assertEquals("10 * X ^ 5".replace(" ", ""), p.toString().replace(" ", ""));
    }


    @Test
    public void testString2() {
        Poly p = PolyFactory.parse("X^7 + 10 * X^5 + 1 * X^7 + 2 * X^10 + X^2");
        assertEquals("1 * X^2 + 10 * X ^ 5 + 2 * X^7 + 2 * X^10".replace(" ", ""), p.toString().replace(" ", ""));
    }

    @Test
    public void testString3() {
        Poly p = PolyFactory.parse("10 * X^10 - 5 * X^9");
        assertEquals("-5*X^9 + 10*X^10".replace(" ", ""), p.toString().replace(" ", ""));
    }

    @Test
    public void testString4() {
        Poly p = PolyFactory.parse("10 * X^10 - 10 * X^10");
        String poly = p.toString().replace(" ", "");
        if (!(poly.equals("") || poly.equals("0*X^0"))) {
            fail();
        }
    }


    @Test
    public void testPolyFunction1() {
        DoubleUnaryOperator polyFunction = PolyFactory.parseToFunction("X^2 + X^2 + 3 * X + 7");
        assertEquals(21, polyFunction.applyAsDouble(2), 0.00001);
    }

    @Test
    public void testPolyFunction2() {
        DoubleUnaryOperator polyFunction = PolyFactory.parseToFunction("X^2 + X^2 + 3 * X - 7");
        assertEquals(7, polyFunction.applyAsDouble(2), 0.00001);
    }

}
