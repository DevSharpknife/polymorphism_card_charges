public class DebitCard extends PaymentCard {
    private int sortCode;
    private int accountNumber;


    public DebitCard(String cardNumber, String expiryDate, String cvv, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, cvv);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
}
