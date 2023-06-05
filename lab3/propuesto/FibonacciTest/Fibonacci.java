package FibonacciTest;
import java.math.BigInteger;
import java.security.Principal;

public class Fibonacci {
    private BigInteger[][] multiplyMatrix(BigInteger[][] m1, BigInteger[][] m2){
        BigInteger a11 = new BigInteger("0");
        BigInteger a12 = new BigInteger("0");
        BigInteger a21 = new BigInteger("0");
        BigInteger a22 = new BigInteger("0");

        a11 = m1[0][0].multiply(m2[0][0]).add(m1[0][1].multiply(m2[1][0]));
        a12 = m1[0][0].multiply(m2[0][1]).add(m1[0][1].multiply(m2[1][1]));
        a21 = m1[1][0].multiply(m2[0][0]).add(m1[1][1].multiply(m2[1][0]));
        a22 = m1[1][0].multiply(m2[0][1]).add(m1[1][1].multiply(m2[1][1]));

        BigInteger[][] result = {{a11, a12}, {a21, a22}};
        
        return result;
    }
    public BigInteger fibonacci(long n){
        if(n < 0){ return new BigInteger("-1");}
        if(n == 0){ return BigInteger.ZERO;}

        n -= 2;
        BigInteger[][] principal = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        BigInteger[][] aux = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        
        while(n > 0){
            if((n & 1) == 1){
                principal = multiplyMatrix(principal, aux);
            }
            aux = multiplyMatrix(aux, aux);
            n >>= 1;
        }
        return principal[0][0];
    }
}