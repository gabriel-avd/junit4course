import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

    @Before
    public void setup(){
        System.out.println("Before");
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
    }

     @After
     public void tear_down(){
         System.out.println("After");
     }
}
