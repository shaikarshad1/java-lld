package src.behavioural.template;

public abstract class OrderItem {

    public final void placeOrder(){
        addToCart();
        selectDeliveryAddress();
        payment();
        invoiceGeneration();
        orderDetails();
    }

    private void orderDetails() {
        System.out.println("Order details displayed.");
    }

    private void invoiceGeneration() {
        System.out.println("Invoice generated.");
    }

    public abstract void payment();

    private void selectDeliveryAddress() {
        System.out.println("Delivery address selected.");
    }

    private void addToCart() {
        System.out.println("Item added to cart.");
    }
}
