import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;
    
    @Before
    public void before (){
        debitCard = new DebitCard("5639836792734564", "03/21","567", "2009187", "12345678");
    }

    @Test
    public void hasCardNumber(){
    assertEquals("5639836792734564", debitCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate(){
    assertEquals("03/21", debitCard.getExpiryDate());
    }

    @Test
    public void hasCVV(){
    assertEquals("567", debitCard.getCvv());
    }

    @Test
    public void hasSortCode(){
    assertEquals("2009187", debitCard.getSortCode());
    }
    
    @Test
    public void hasAccountNumber(){
    assertEquals("12345678", debitCard.getAccountNumber());
    }
}