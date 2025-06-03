package src.behavioural.state;

public class StateMain {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem("Protein Bar");
        vendingMachine.insertCoin(50);
        vendingMachine.dispenseItem();
        vendingMachine.selectItem("Protein Bar");
        vendingMachine.insertCoin(50);
        vendingMachine.dispenseItem();
        vendingMachine.dispenseItem();
    }
}
