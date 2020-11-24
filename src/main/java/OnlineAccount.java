import java.util.ArrayList;

public class OnlineAccount {

    private String name;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private GiftCard giftCard;
//    private ArrayList<transactionFees> fees;

    public OnlineAccount(String name, CreditCard creditCard, DebitCard debitCard, GiftCard giftCard) {
        this.name = name;
        this.creditCard = creditCard;
        this.debitCard = debitCard;
        this.giftCard = giftCard;
//        this.fees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public GiftCard getGiftCard() {
        return giftCard;
    }

//    public ArrayList<TransactionFees> getFees() {
//        return fees;
//    }
}
