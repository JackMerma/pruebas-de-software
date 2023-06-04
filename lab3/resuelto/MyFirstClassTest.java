import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstClassTest{
    @Test 
    public void myFirstMethod(){
        String str= "JUnit is working fine";
        assertEquals("JUnit is working fine",str);
    } 
}
