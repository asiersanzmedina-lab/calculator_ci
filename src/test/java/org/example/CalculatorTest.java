package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author asier
 * @created 20/10/2026
 */

public class CalculatorTest {
    private Calculator calculator;

    @Test
    public void testSquare(){
        System.out.println("square algorithm test");
        assertEquals( expected: 4, calculator.square(num: 2));
    }
}
