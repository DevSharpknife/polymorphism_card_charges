import java.util.ArrayList;

public abstract class PaymentCard {

    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private ArrayList<Double> charges;

    public PaymentCard(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.charges = new ArrayList<>();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }


}
