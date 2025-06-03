package src.behavioural.template;

public class CreditCardPayment extends OrderItem {

    @Override
    public void payment() {
        System.out.println("Paid using Credit Card.");
    }
}
