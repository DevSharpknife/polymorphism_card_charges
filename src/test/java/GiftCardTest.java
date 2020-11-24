import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftcard;

    @Before
    public void before(){
        giftcard = new GiftCard("Zara", 50.00);
    };

    @Test
    public void hasBrand(){
        assertEquals("Zara", giftcard.getBrand());
    }

    @Test
    public void hasBalance(){
        assertEquals(50.00, giftcard.getBalance(), 0.01);
    }

    @Test
    public void canReduceBalance(){
        giftcard.reduceBalance(10.00);
        assertEquals(40.00, giftcard.getBalance(), 0.01);
    }
}