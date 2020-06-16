import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("1/1/2018")
    void testNextDay() {
        int inputDay = 1;
        int inputMonth = 1;
        int inputYear = 2018;
        String expected = "2-1-2018";

        String result = NextDayCalculator.nextDay(inputDay, inputMonth, inputYear);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("31/1/2018")
    void testNextDay1() {
        int inputDay = 31;
        int inputMonth = 1;
        int inputYear = 2018;
        String expected = "1-2-2018";

        String result = NextDayCalculator.nextDay(inputDay, inputMonth, inputYear);
        assertEquals(expected, result);
    }
}