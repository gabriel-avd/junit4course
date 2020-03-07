import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helper;

    @Before
    public void setup(){
        helper = new StringHelper();
    }

    @Test
    public void truncateAInFirst2Positions_AInFirst2Positions(){
        assertEquals("CB", helper.truncateAInFirst2Positions("AACB"));
    }

    @Test
    public void truncateAInFirst2Positions_AInFirstPositions(){
        assertEquals("CB", helper.truncateAInFirst2Positions("ACB"));
    }

    @Test
    public void truncateAInFirst2Positions_empty(){
        assertEquals("", helper.truncateAInFirst2Positions(""));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_2length(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_lowerThan1(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_true(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_false(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
}
