package src.behavioural.state;

public class DispenseItemState implements VendingMachineStates {
    private VendingMachine vendingMachine;

    public DispenseItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("Please wait, dispensing item...");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Please wait, dispensing item...");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed successfully!");
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}
