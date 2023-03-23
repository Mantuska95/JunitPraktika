package eu.codeacademy.javaua2;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.QuadraticEquation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QuadraticEquationTest {
    private static QuadraticEquation quadraticEquation;

    @BeforeEach
    void setUp(){
        quadraticEquation=new QuadraticEquation();
    }
    @Test
    void solveQuadraticEquationNoAnswersTest() {

        Pair<Double, Double> answer = quadraticEquation.solveQuadraticEquation(5.0,6.0,3.0);

        assertNull(answer.getLeft());
        assertNull(answer.getRight());
    }

    @Test
    void solveQuadraticEquationOneAnswerTest() {

        Pair<Double, Double> answer = quadraticEquation.solveQuadraticEquation(1.0,4.0,4.0);

        assertEquals(answer.getLeft(), -2.0);
        assertNull(answer.getRight());
    }
    @Test
    void solveQuadraticEquationTwoAnswersTest() {
        Pair<Double, Double> answer = quadraticEquation.solveQuadraticEquation(1.0,7.0,6.0);

        assertEquals(answer.getLeft(), -1.0);
        assertEquals(answer.getRight(), -6.0);
    }

}
