import org.junit.Test;

import static org.junit.Assert.*;

public class Main1Test {

    @Test
    public void Double() {
        double two =45.89;
        double second1=Math.round(two);
        assertEquals(46, second1,0);
    }
}