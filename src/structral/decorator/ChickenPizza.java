package src.structral.decorator;

public class ChickenPizza implements Pizza{
    @Override
    public String getDesc() {
        return "Chicken Pizza";
    }

    @Override
    public int getCost() {
        return 120;
    }
}
