import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkEvenOddTest {

    @Test
    void TC1() {
        checkEvenOdd checkNum1 = new checkEvenOdd();
        assertEquals(checkNum1.checkEvenOddNum(4), "The number is even");
         }

    @Test
    void TC2() {
        checkEvenOdd checkNum2 = new checkEvenOdd();
        assertEquals(checkNum2.checkEvenOddNum(0), "The number is even");
    }

    @Test
    void TC3() {
        checkEvenOdd checkNum3 = new checkEvenOdd();
        assertEquals(checkNum3.checkEvenOddNum(-1), "The number is odd");
    }

    @Test
    void TC4() {
        checkEvenOdd checkNum4 = new checkEvenOdd();
        assertEquals(checkNum4.checkEvenOddNum(101), "The number is odd");
    }

}