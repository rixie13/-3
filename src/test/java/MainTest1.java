import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest1 {

    @Test
    public void taxEarningsMinusSpendigs() {
        int earnings=23;
        int spendigs=34;
        int tr=Main.taxEarningsMinusSpendigs(earnings,spendigs);
        assertEquals(11,tr);
    }
}