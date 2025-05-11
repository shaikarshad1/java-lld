package src.structral.decorator;

public class FrenchFries implements PizzaAddOns{

    private final Pizza pizza;

    public FrenchFries(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDesc() {
        return this.pizza.getDesc()+" with peri peri French Fries";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+60;
    }
}
