import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void assertEqualsFalse() {
        int earnings=24;
        int tr=Main.taxEarnings(earnings);
        assertEquals(45,tr);
    }
    @Test
    public void assertEqualsTrue() {
        int earnings=38;
        int tr=Main.taxEarnings(earnings);
        assertEquals(2,tr);
    }
}