import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class TestingUltCal {
    //UltimateCalculator TestUC = new UltimateCalculator();

    @Before
    public void setUp() throws Exception {
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void divisionNegativeExceptionTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(Double.NEGATIVE_INFINITY, CalculateSymbols.DIVISION, 02),0.01);

    }

    @Test
    public void divisionByZeroTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(100, CalculateSymbols.DIVISION, 0),0.01);
    }

    @Test
    public void divisionPositiveExceptionTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(Double.POSITIVE_INFINITY, CalculateSymbols.DIVISION, Double.MIN_VALUE),0.01);
    }

    @Test
    public void plusPositiveExceptionTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.PLUS, Double.MAX_VALUE),0.01);
    }

    @Test
    public void plusNegativeExceptionTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(-Double.MAX_VALUE, CalculateSymbols.PLUS, -Double.MAX_VALUE),0.01);
    }

    @Test
    public void minusNegativeExceptionTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(-Double.MAX_VALUE, CalculateSymbols.MINUS, Double.MAX_VALUE),0.01);
    }

    @Test
    public void minusPositiveExceptionTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.MINUS, -Double.MAX_VALUE),0.01);
    }

    @Test
    public void multiplicationNegativeExceptionTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(-Double.MAX_VALUE, CalculateSymbols.MULTIPLICATION, Double.MAX_VALUE),0.01);
    }

    @Test
    public void multiplicationPositiveExceptionTest() throws UltimateCalculator.CalculateException {
        exception.expect(UltimateCalculator.CalculateException.class);
        assertEquals(5553535,UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.MULTIPLICATION, Double.MAX_VALUE),0.01);
    }

}
