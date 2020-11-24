import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OnlineAccountTest {
    OnlineAccount onlineAccount;
    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;

    @Before
    public void before() {
        creditCard = new CreditCard("5639836792734564", "03/21", "567", 0.4, 1000);
        debitCard = new DebitCard("5639836792734999", "03/22","568", "2009187", "12345678");
        giftCard = new GiftCard("Tesco", 50.00);
        onlineAccount = new OnlineAccount("John Johnson", creditCard, debitCard, giftCard);
    }

    @Test
    public void canGetName() {
        assertEquals( "John Johnson", onlineAccount.getName() );
    }

    @Test
    public void canGetCreditCard() {
        assertEquals( creditCard, onlineAccount.getCreditCard() );
    }

    @Test
    public void canGetDebitCard() {
        assertEquals( debitCard, onlineAccount.getDebitCard() );
    }

    @Test
    public void canGetGiftCard() {
        assertEquals( giftCard, onlineAccount.getGiftCard() );
    }

    @Test
    public void canGetFees() {
    }
}