public class CreditCard extends PaymentCard{
    private double riskMultiplier;
    private double creditLimit;

    public CreditCard(String cardNumber, String expiryDate, String cvv, double riskMultiplier, double creditLimit){
        super(cardNumber, expiryDate, cvv);
        this.riskMultiplier = riskMultiplier;
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public double getRiskMultiplier(){
        return this.riskMultiplier;
    }
}
