import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void nextDay() {
        int ngay = 31;
        int thang = 12;
        int nam = 2020;
        int[] result = NextDayCalculator.nextDay(ngay,thang,nam);
        int[] expected = {1,1,2021};
        assertArrayEquals(expected,result);
    }
}