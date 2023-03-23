package eu.codeacademy.javaua2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.FibonacciNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    private static FibonacciNumbers fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new FibonacciNumbers();
    }

    @Test
    void fibonacciSequenceFirstElementTest() {
        Integer number = fibonacci.fibonacciSequence(1);
        assertEquals(number, 1);
    }

    @Test
    void fibonacciSequenceSecondElementTest() {
        Integer number = fibonacci.fibonacciSequence(2);
        assertEquals(number, 1);
    }

    @Test
    void fibonacciSequenceNegativeElementTest() {
        Integer number = fibonacci.fibonacciSequence(-100);

        assertEquals(number, -1);

    }

    @Test
    void fibonacciSequenceSeventhElementTest() {
        Integer number = fibonacci.fibonacciSequence(7);

        assertEquals(number, 13);
    }

    @Test
    void fibonacciSequenceTwelfthElementTest() {
        Integer number = fibonacci.fibonacciSequence(12);

        assertEquals(number, 144);
    }
}
