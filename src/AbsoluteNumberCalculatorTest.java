import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AbsoluteNumberCalculatorTest {

    @Test
    @DisplayName("Giá trị tuyệt đối")
    void findAbsolute1() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Giá trị tuyệt đối")
    void findAbsoluteNegative1(){
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}