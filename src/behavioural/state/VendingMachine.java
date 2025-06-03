package src.behavioural.state;

public class VendingMachine {
    private VendingMachineStates currentState;
    private VendingMachineStates idleState;
    private VendingMachineStates selectItemState;
    private VendingMachineStates dispenseItemState;

    public VendingMachine() {
        idleState = new InitialState(this);
        selectItemState = new SelectItemState(this);
        dispenseItemState = new DispenseItemState(this);
        currentState = idleState;
    }

    public void setState(VendingMachineStates state) {
        this.currentState = state;
    }

    public VendingMachineStates getIdleState() {
        return idleState;
    }

    public VendingMachineStates getSelectItemState() {
        return selectItemState;
    }

    public VendingMachineStates getDispenseItemState() {
        return dispenseItemState;
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(amount);
    }

    public void selectItem(String item) {
        currentState.selectItem(item);
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }
}
