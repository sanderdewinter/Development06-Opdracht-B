import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void test() {
        int uitkomst = Main.reken(4, 6);
        int expected = 10;
        assertEquals(uitkomst, expected);
    }
}