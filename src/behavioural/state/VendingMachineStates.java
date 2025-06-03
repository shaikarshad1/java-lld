package src.behavioural.state;

public interface VendingMachineStates {
    void insertCoin(int amount);
    void selectItem(String item);
    void dispenseItem();
}
