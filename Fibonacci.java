package Java;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        int n=100;
        BigInteger[] fibonacci = new BigInteger[n];
        //  long int trong java chi tu đến 2e63-1 nên ta dùng BigInteger
        fibonacci[0]=BigInteger.ZERO;
        fibonacci[1]=BigInteger.ONE;
        for(int i=2; i<n;i++){
            fibonacci[i]=fibonacci[i-1].add(fibonacci[i-2]); 
            // type biginteger dùng phương thúc .add() thay vì toán tử +
        }
        for(int i=0; i<fibonacci.length; i++){
            System.out.println(fibonacci[i]);
        }
    }
}
