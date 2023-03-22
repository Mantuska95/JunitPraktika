package service;

import java.util.ArrayList;

public class CalculatorService {
    public Integer findMaxValue(ArrayList<Integer> numbers){
        Integer maxNumber = numbers.get(0);
        for (Integer number:numbers) {
            if (number>maxNumber){
                maxNumber=number;
            }
        }
        return maxNumber;
    }

   public Integer calculate(Integer firsNumber,Integer secondNumber,Character operation) {
       switch (operation) {
           case '+':
               return firsNumber+secondNumber;
           case '*':
               return firsNumber*secondNumber;
           case '/':
               return firsNumber/secondNumber;
           case '-':
               return firsNumber-secondNumber;
           default:
               throw  new IllegalArgumentException("Illegal operation "+ operation );
       }
   }
}
