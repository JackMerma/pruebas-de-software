package TestMax;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

public class BigIntegerTest {
    @Test 
    public void primeroMayorQueSegundo(){
        BigInteger a = new BigInteger("92222");
        BigInteger b = new BigInteger("12333");
        assertEquals(a, a.max(b));
    } 
    @Test 
    public void segundoMayorQuePrimero(){
        BigInteger a = new BigInteger("12333");
        BigInteger b = new BigInteger("92222");
        assertEquals(b, a.max(b));
    } 
    @Test 
    public void iguales(){
        BigInteger a = new BigInteger("123");
        BigInteger b = new BigInteger("123");
        assertTrue(a.max(b).equals(a) && a.equals(b));
    } 
    @Test 
    public void negativos(){
        BigInteger a = new BigInteger("-7");
        BigInteger b = new BigInteger("-999999");
        assertEquals(a, a.max(b));
    } 
    @Test
    public void numerosGrandes(){
        BigInteger a = new BigInteger("999999999999999999");
        BigInteger b = new BigInteger("100000000000000000");
        assertEquals(a, a.max(b));
    }
}