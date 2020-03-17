import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayTest {

    @Test
    public void testArraySort_randomArray() {
        int[] numbers = {3, 15, 6, 2};
        int[] sorted = {2, 3, 6, 15};

        Arrays.sort(numbers);

        assertArrayEquals(sorted, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_nullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test
    public void testArraySort_emptyArray() {
        int[] numbers = {};
        int[] sorted = {};
        Arrays.sort(numbers);

        assertArrayEquals(sorted, numbers);
    }

    @Test(timeout = 50)
    public void testArraySort_performance() {
        int[] numbers = {3, 15, 6, 2};

        for (int i = 0; i < 1000000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }
}
