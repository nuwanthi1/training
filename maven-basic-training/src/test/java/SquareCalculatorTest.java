import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareCalculatorTest {

    @Test
    public void testCalculateSquare() {

        Assertions.assertEquals(25, SquareCalculator.calculateSquare(5));
        Assertions.assertEquals(16, SquareCalculator.calculateSquare(4));
        Assertions.assertEquals(36, SquareCalculator.calculateSquare(6));
    }
}