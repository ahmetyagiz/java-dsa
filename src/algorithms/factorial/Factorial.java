package algorithms.factorial;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        //int myFac = calculateFactorial(4);

        BigInteger myNum = printFactorial(5);
        System.out.println(myNum);
    }

    public static BigInteger printFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    // Recursive
//    public static int calculateFactorial(int n) {
//        if (n == 1) return 1;
//        return n * calculateFactorial(n - 1);
//    }

}