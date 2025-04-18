import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.firsttest.Calculatrice;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    public void testAddition() {
        assertEquals(15, calc.addition(10, 5));
    }

    @Test
    public void testSoustraction() {
        assertEquals(5, calc.soustraction(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calc.multiplication(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.division(10, 5));
    }

    @Test
    public void testDivisionParZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.division(10, 0);
        });
        assertEquals("Division par zéro n'est pas permise.", exception.getMessage());
    }
}