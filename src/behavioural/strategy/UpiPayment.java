package src.behavioural.strategy;

public class UpiPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
