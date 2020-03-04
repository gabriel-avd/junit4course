import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void test(){
        StringHelper helper = new StringHelper();
        String expected = "CB";

        assertEquals(expected, helper.truncateAInFirst2Positions("AACB"));
        assertEquals(expected, helper.truncateAInFirst2Positions("ACB"));

    }
}
