import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard("5639836792734564", "03/21", "567", 0.4, 1000);
    }

    @Test
    public void hasCardNumber(){
    assertEquals("5639836792734564", creditCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate(){
    assertEquals("03/21", creditCard.getExpiryDate());
    }

    @Test
    public void hasCVV(){
    assertEquals("567", creditCard.getCvv());
    }

    @Test
    public void hasRiskMultiplier(){
        assertEquals(0.4, creditCard.getRiskMultiplier(), 0.01);
    }

    @Test
    public void hasCreditLimit(){
        assertEquals(1000, creditCard.getCreditLimit(), 0.01);
    }


}
