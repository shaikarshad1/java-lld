package src.creational.factory;

public class VechicleFactory {

    public static Vechicle getVechicle(String vechicleType) {
        if(vechicleType.equals("car")){
            return new Car();
        } else if(vechicleType.equals("bike")){
            return new Bike();
        }else {
            return null;
        }
    }
}
