package src.behavioural.state;

public class SelectItemState implements VendingMachineStates {

    private VendingMachine vendingMachine;

    public SelectItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("Coin already inserted. Please select an item.");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item " + item + " selected.");
        vendingMachine.setState(vendingMachine.getDispenseItemState());
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item first.");
    }
}
