package src.behavioural.template;

public class UpiPayment extends OrderItem {
    @Override
    public void payment() {
        System.out.println("Paid using UPI.");
    }
}
