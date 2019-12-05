package poly;

import org.junit.Test;
import java.util.function.DoubleUnaryOperator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Task2 {

    @Test
    public void testPolyFunction1() {
        DoubleUnaryOperator polyFunction = PolyFactory.parseToFunction("X^3 + X^4");
        assertEquals(24, polyFunction.applyAsDouble(2), 0.00001);
    }

    @Test
    public void testPolyFunction2() {
        DoubleUnaryOperator polyFunction = PolyFactory.parseToFunction("X^5 - 3*X^3");
        assertEquals(8, polyFunction.applyAsDouble(2), 0.00001);
    }

    @Test
    public void testPolyFunction3() {
        DoubleUnaryOperator polyFunction = PolyFactory.parseToFunction("X^7 - X^7");
        assertEquals(0, polyFunction.applyAsDouble(2), 0.00001);
    }

    @Test
    public void testPolyFunction4() {
        DoubleUnaryOperator polyFunction = PolyFactory.parseToFunction("X^3 + 4 * X^4");
        assertEquals(2625, polyFunction.applyAsDouble(5), 0.00001);
    }

}
