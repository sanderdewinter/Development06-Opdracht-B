import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testPasses() {
        String expected = "Hello, JUnit!";
        String hello = "Hello, JUnit!";
        assertEquals(hello, expected);
    }

    @Test
    public void testFails() {
        // The worlds most obvious bug:
        assertTrue(false);
    }

    @Test
    public void testArray() {
        int [] array1 = new int[] {1, 2, 3};
        int [] array2 = new int[] {1, 2, 3};
        assertArrayEquals(array1, array2);
    }

    @Test
    public void test() {
        int uitkomst = Main.reken(4, 6);
        int expected = 10;
        assertEquals(uitkomst, expected);
    }
}