package src.behavioural.state;

public class InitialState implements VendingMachineStates {

    private VendingMachine vendingMachine;

    public InitialState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("Coin inserted: " + amount);
        vendingMachine.setState(vendingMachine.getSelectItemState());
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Please insert coin before selecting an item.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert coin and select an item first.");
    }
}
