public class GiftCard implements IPay{

    private String brand;
    private double balance;

    public GiftCard(String brand, double balance){
        this.brand = brand;
        this.balance = balance;
    }

    public String getBrand() {
        return brand;
    }

    public double getBalance() {
        return balance;
    }

    public void charge(double purchaseAmount){
        this.balance -= purchaseAmount;
    }

    // @Override
    // public double charge(){

    // }

    @Override
    public double getTransactionFee(double TransactionAmount){
        return 0;
    }


}
