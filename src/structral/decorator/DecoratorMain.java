package src.structral.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Pizza vegpizza=new VegPizza();
        System.out.println(vegpizza.getDesc()+" \n Cost :: "+vegpizza.getCost());

        Pizza pizza=new ChickenPizza();
        System.out.println(pizza.getDesc()+" \n Cost :: "+pizza.getCost());

        pizza=new ExtraCheese(pizza);
        System.out.println(pizza.getDesc()+" \n Cost :: "+pizza.getCost());

        pizza=new FrenchFries(pizza);
        System.out.println(pizza.getDesc()+" \n Cost :: "+pizza.getCost());
    }
}
