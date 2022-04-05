import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    @DisplayName("Multiplication test")
    void multiply() {
        assertEquals(4, SimpleCalculator.multiply(2, 2));
    }

    @Test
    @DisplayName("Subtraction test")
    void subtract() {
        //failed test as expected
        assertEquals(5, SimpleCalculator.subtract(8, 3));
    }
}