package FibonacciTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

public class FibonacciTest{
    private Fibonacci fibo;

    @Before
    public void creacionObjetoFibonacci(){
        fibo = new Fibonacci();
    }
    @Test 
    public void fibonacciNegativo(){
        BigInteger f = fibo.fibonacci(-100);
        BigInteger result = new BigInteger("-1");
        assertEquals(result, f);
    } 
    @Test 
    public void fibonacciCero(){
        BigInteger f = fibo.fibonacci(0);
        BigInteger result = BigInteger.ZERO;
        assertEquals(result, f);
    } 
    @Test 
    public void fibonacciUno(){
        BigInteger f = fibo.fibonacci(1);
        BigInteger result = BigInteger.ONE;
        assertEquals(result, f);
    } 
    @Test 
    public void fibonacciTres(){
        BigInteger f = fibo.fibonacci(101);
        BigInteger result = new BigInteger("573147844013817084101");
        assertEquals(result, f);
    } 
}