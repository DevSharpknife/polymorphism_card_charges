public class GiftCard {

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

    public double reduceBalance(double charge){
        return this.balance -= charge;
    }

    // @Override
    // public double getTransactionFee(){
    //     this.transactionFee = 0;
    // }


}
