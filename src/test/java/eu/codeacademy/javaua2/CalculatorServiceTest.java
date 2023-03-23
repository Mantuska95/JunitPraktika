package eu.codeacademy.javaua2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.CalculatorService;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceTest {

    private static CalculatorService calculatorService;
    @BeforeAll
    static void setup(){
        calculatorService=new CalculatorService();
    }
    @Test
    void findMaxValueTestOneNumberInArray(){

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(9,6,333,5,0,-1,44,999));

        Integer maxNumber=calculatorService.findMaxValue(numbers);

        System.out.println(maxNumber);

        assertEquals(maxNumber, 999);

    }
    @Test
    void calculateTestPlus(){
        Integer firsNumber = 10;
        Integer secondNumber =5;
        Character operation ='+';
        Integer calculate=calculatorService.calculate(firsNumber,secondNumber,operation);
        assertEquals(calculate,15);

    }
    @Test
    void calculateTestMinus(){
        Integer firsNumber = 10;
        Integer secondNumber =5;
        Character operation ='-';
        Integer calculate=calculatorService.calculate(firsNumber,secondNumber,operation);
        assertEquals(calculate,5);

    }
    @Test
    void calculateTestDivide(){
        Integer firsNumber = 10;
        Integer secondNumber =5;
        Character operation ='/';
        Integer calculate=calculatorService.calculate(firsNumber,secondNumber,operation);
        assertEquals(calculate,2);

    }
    @Test
    void calculateTestMultiply(){
        Integer firsNumber = 10;
        Integer secondNumber =5;
        Character operation ='*';
        Integer calculate=calculatorService.calculate(firsNumber,secondNumber,operation);
        assertEquals(calculate,50);

    }
    @Test
    void calculateTestException(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class, ()->{
            calculatorService.calculate(10,5,'a');
        });
    }
    @Test
    void calculateTestMultiplyByZero(){
        ArithmeticException exception=assertThrows(ArithmeticException.class, ()->{
            calculatorService.calculate(10,0,'/');
        });
    }
//    @Test
//    void reverseString(String value) {
//        CalculatorService calculatorService = new CalculatorService();
//        String reversed = calculatorService.reverseString("LABAS");
//        assertEquals(reversed, "SABAL");
//    }
}
