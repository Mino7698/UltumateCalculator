import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingUltCal {
    UltimateCalculator TestUC = new UltimateCalculator();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void TestUC() {
        assertEquals(25.0, UltimateCalculator.EasyCalculate(5.0, "*", 5.0), 0.001);
        assertEquals(5.562684646268003E-309, UltimateCalculator.EasyCalculate(1.0, "/", Double.MAX_VALUE), 0.001);
        assertEquals(1, UltimateCalculator.EasyCalculate(Double.MAX_VALUE, "/", Double.MAX_VALUE), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, UltimateCalculator.EasyCalculate(Double.MAX_VALUE, "/", Double.MIN_VALUE), 0.001);
        assertEquals(4.9E-324, UltimateCalculator.EasyCalculate(Double.MIN_VALUE, "/", Double.MAX_VALUE), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, UltimateCalculator.EasyCalculate(Double.MAX_VALUE, "*", Double.MAX_VALUE), 0.001);
        //assertEquals(5.0, UltimateCalculator.EasyCalculate(5.0, "/", 0.0), 0.001);


        for (int ik = -3; ik < 3; ik++) {
            for (int jk = 3; jk > -3; jk--) {
                assertEquals((ik * 1E300) / (jk * 1E300), UltimateCalculator.EasyCalculate(ik * 1E300, "/", jk * 1E300), 0.001);
            }
        }


    }

}
