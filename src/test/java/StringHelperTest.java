import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void test(){
        StringHelper helper = new StringHelper();
        String actual = helper.truncateAInFirst2Positions("AACB");
        String expected = "CB";

        assertEquals(expected, actual);

    }
}
