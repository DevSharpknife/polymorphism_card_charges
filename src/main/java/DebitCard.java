public class DebitCard extends PaymentCard {
    private String sortCode;
    private String accountNumber;


    public DebitCard(String cardNumber, String expiryDate, String cvv, String sortCode, String accountNumber) {
        super(cardNumber, expiryDate, cvv);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
}
