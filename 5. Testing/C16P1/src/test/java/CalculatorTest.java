import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Sumar dos numeros")
    void add() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void multiply() {
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    void addMultipleOperands(){
        assertEquals(10,calculator.addStream(4,3,2,1));
    }
}
