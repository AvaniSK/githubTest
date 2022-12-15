import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testtest {
    
    @Test 
    public void testing1()
    {
        var test = new test();

        String expectedval = "avani";
        assertEquals(expectedval,test.displayNames());
    }

}
