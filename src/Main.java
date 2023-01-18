import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        for (numberOne = 2, numberTwo = 1; numberTwo * numberOne <= 100; numberTwo++) {
           // System.out.println("The result of " + "(" + numberOne + " * " + numberTwo +  ")"+ " is = " +  (numberOne * numberTwo));
        }

        long number= 1239_000_000_002_344_000L;

        double number1 = 0.02;
        double number2 = 0.03;
        double result = number2 - number1; // //0.009999999999999998
//        System.out.println(result);

//        //if you are working wsith money
        BigDecimal number3 = new BigDecimal("0.02");
        BigDecimal number4 = new BigDecimal("0.03");
        System.out.println(number4.subtract(number3)); //0.01

    }
}