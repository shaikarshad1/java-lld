package src.structral.decorator;

public class VegPizza implements Pizza{
    @Override
    public String getDesc() {
        return "Veg Pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
