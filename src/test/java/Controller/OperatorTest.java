package Controller;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the Operator class (4 tests)
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class OperatorTest {

    @Test
    public void moduloTest01() {
        // Arrange
        Operator operator = new Operator();
        // Act
        int modulo = operator.modulo(9,5);
        // Assert
        assertEquals(4, modulo);
    }

    @Test
    public void moduloTest02_MinusNumber() {
        // Arrange
        Operator operator = new Operator();
        // Act
        int modulo = operator.modulo(-2,5);
        // Assert
        assertEquals(3, modulo);
    }

    @Test
    public void moduloTest03_ModuloOne() {
        // Arrange
        Operator operator = new Operator();
        // Act
        int modulo = operator.modulo(9,1);
        // Assert
        assertEquals(0, modulo);
    }

    @Test
    public void moduloTest04_ModuloZero() {
        // Arrange
        Operator operator = new Operator();
        // Act
        int modulo = operator.modulo(9,0);
        // Assert
        assertEquals(0, modulo);
    }
}
