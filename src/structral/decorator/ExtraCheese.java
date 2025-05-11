package src.structral.decorator;

public class ExtraCheese implements PizzaAddOns{

    private final Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDesc() {
        return this.pizza.getDesc()+" with extra cheese";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+20;
    }
}
