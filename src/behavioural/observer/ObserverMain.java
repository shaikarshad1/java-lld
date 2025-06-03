package src.behavioural.observer;

public class ObserverMain {
    public static void main(String[] args) {
        ElectronicItem samsungS25Ultra = new ElectronicItem("Samsung S25 ultra", 50000, false);
        ElectronicItem  macBook = new ElectronicItem("MacBook Pro M4 Max 16-inch", 30000, false);

        samsungS25Ultra.addObserver("shaikarshadali01@gmail.com");
        samsungS25Ultra.addObserver("ironman@gmail.com");
        samsungS25Ultra.addObserver("batman@gmail.com");

        macBook.addObserver("shaikarshadali01@gmail.com");
        macBook.addObserver("thor@gmail.com");
        macBook.addObserver("flash@gmail.com");

        samsungS25Ultra.notifyObservers(true);
        macBook.notifyObservers(true);


    }
}
