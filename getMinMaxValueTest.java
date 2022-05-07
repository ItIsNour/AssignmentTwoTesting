import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getMinMaxValueTest {

    int [] N = new int[]{ 1, 5, -11, 12, -3, 60, 18, 23, 4, -6};
    int n = N.length;

    @Test
    void Max() {
        int maxValue = getMinMaxValue.getMaxValue(N);
        assertTrue(maxValue == 60);
    }

    @Test
    void Min() {
        int minValue = getMinMaxValue.getMinValue(N);
        assertTrue(minValue == -11);
    }


}