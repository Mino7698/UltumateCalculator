import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingUltCal {
    //UltimateCalculator TestUC = new UltimateCalculator();

    @Before
    public void setUp() throws Exception {
    }

    @Test //(expected = UltimateCalculator.CalculateException.class)
    public void divisionNegativeExceptionTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(Double.NEGATIVE_INFINITY, CalculateSymbols.DIVISION, 2);
    }

    @Test
    public void divisionByZeroTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(100, CalculateSymbols.DIVISION, 0);
    }

    @Test
    public void divisionPositiveExceptionTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(Double.POSITIVE_INFINITY, CalculateSymbols.DIVISION, Double.MIN_VALUE);
    }

    @Test
    public void plusPositiveExceptionTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.PLUS, Double.MAX_VALUE);
    }

    @Test
    public void plusNegativeExceptionTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(-Double.MAX_VALUE, CalculateSymbols.PLUS, -Double.MAX_VALUE);
    }

    @Test
    public void minusNegativeExceptionTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(-Double.MAX_VALUE, CalculateSymbols.MINUS, Double.MAX_VALUE);
    }

    @Test
    public void minusPositiveExceptionTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.MINUS, -Double.MAX_VALUE);
    }

    @Test
    public void multiplicationNegativeExceptionTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(-Double.MAX_VALUE, CalculateSymbols.MULTIPLICATION, Double.MAX_VALUE);
    }

    @Test
    public void multiplicationPositiveExceptionTest() throws UltimateCalculator.CalculateException {
        UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.MULTIPLICATION, Double.MAX_VALUE);
    }

}

        /*
          assertEquals(25.0, UltimateCalculator.EasyCalculate(5.0, CalculateSymbols.MULTIPLICATION, 5.0), 0.001);
        assertEquals(28.0, UltimateCalculator.EasyCalculate(7.0, CalculateSymbols.MULTIPLICATION, 4.0), 0.001);
        assertEquals(5.562684646268003E-309, UltimateCalculator.EasyCalculate(1.0, CalculateSymbols.DIVISION, Double.MAX_VALUE), 0.001);
        assertEquals(1, UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.DIVISION, Double.MAX_VALUE), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.DIVISION, Double.MIN_VALUE), 0.001);
        assertEquals(4.9E-324, UltimateCalculator.EasyCalculate(Double.MIN_VALUE, CalculateSymbols.DIVISION, Double.MAX_VALUE), 0.001);
        assertEquals(1.0, UltimateCalculator.EasyCalculate(Double.MAX_VALUE, CalculateSymbols.DIVISION, Double.MAX_VALUE), 0.001);
        assertEquals(5.0, UltimateCalculator.EasyCalculate(5.0, "/", 0.0), 0.001);
        assertEquals(Double.NEGATIVE_INFINITY, UltimateCalculator.EasyCalculate(-(Double.MAX_VALUE), CalculateSymbols.MINUS, Double.MAX_VALUE), 0.001);

        for (int ik = -3; ik < 3; ik++) {
            for (int jk = 3; jk > -3; jk--) {
                assertEquals((ik * 1E300) / (jk * 1E300), UltimateCalculator.EasyCalculate(ik * 1E300, CalculateSymbols.DIVISION, jk * 1E300), 0.001);
            }
        }*/
