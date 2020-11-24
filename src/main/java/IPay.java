public interface IPay {

        double getTransactionFee(double purchaseAmount);
        void charge(double purchaseAmount);
}
