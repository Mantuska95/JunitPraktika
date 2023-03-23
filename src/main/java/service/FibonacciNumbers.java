package service;

public class FibonacciNumbers {
    Integer n1=0;
    Integer n2=0;
    Integer n3=1;

    public FibonacciNumbers() {
    }
    public Integer fibonacciSequence(Integer number){
        if(number>0){
            for(int i=1;i<number;++i)
            {
                n2=n1+n3;
                n1=n3;
                n3=n2;
            }
        }else {
            n3=-1;
        }
        return n3;
    }

}
