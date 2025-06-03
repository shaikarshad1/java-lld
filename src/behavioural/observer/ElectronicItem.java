package src.behavioural.observer;

import java.util.HashSet;
import java.util.Set;

public class ElectronicItem {
    private String itemName;
    private int price;
    private boolean availability;
    private Set<String> observers = new HashSet<>();

    public ElectronicItem(String itemName, int price, boolean availability) {
        this.itemName = itemName;
        this.price = price;
        this.availability = availability;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public Set<String> getObservers() {
        return observers;
    }

    public void addObserver(String observer) {
        observers.add(observer);
    }

    public void removeObserver(String observer) {
        observers.remove(observer);
    }

    public void notifyObservers(boolean isAvailable) {
        if(!isAvailable){
            return;
        }
        for (String observer : observers) {
            System.out.println("Notifying " + observer + " about stock availability in " + itemName);
        }
    }
}
