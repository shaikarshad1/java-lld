package src.creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Vechicle vechicle=VechicleFactory.getVechicle("bike");
        vechicle.createVehicle();
    }
}
