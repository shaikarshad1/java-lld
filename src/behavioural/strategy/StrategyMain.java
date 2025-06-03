package src.behavioural.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(1000);

        payment = new UpiPayment();
        payment.pay(2000);
    }
}
