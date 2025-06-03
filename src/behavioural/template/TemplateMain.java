package src.behavioural.template;

public class TemplateMain {

    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Placing order with Credit Card payment");
        System.out.println("---------------------");
        OrderItem orderItem = new CreditCardPayment();
        orderItem.placeOrder();

        System.out.println("---------------------");
        System.out.println("Placing order with UPI payment");
        System.out.println("---------------------");
        orderItem = new UpiPayment();
        orderItem.placeOrder();
    }
}
