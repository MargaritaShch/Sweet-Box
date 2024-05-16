import java.util.ArrayList;
import java.util.Comparator;


abstract class Sweet {
    String name;
    double weight;
    double price;

    public Sweet (String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    abstract String getDescription();
}

class Marmalade extends Sweet {
    public Marmalade(String name, double weight, double price){
        super(name, weight, price);
    }

    String getDescription(){
        return "Marmalade: " + name + ", " + weight + "g., " + price + "rub.";
    }
}

class Candy extends Sweet {
    public Candy(String name, double weight, double price){
        super(name, weight, price);
    }

    String getDescription(){
        return "Candy: " + name + ", " + weight + "g., " + price + "rub.";
    }
}


class Chocolate extends Sweet {
    public Chocolate(String name, double weight, double price){
        super(name, weight, price);
    }

    String getDescription(){
        return "Chocolate: " + name + ", " + weight + "g., " + price + "rub.";
    }
}

public interface SweetBox {
    void addSweet(Sweet sweet);
    void remove(int index);
    void removeLast();
    double getTotalWeight();
    double getTotalPrice();
    void showAllSweets();
}

class SweetBoxImpl implements SweetBox{
    private ArrayList<Sweet> sweets = new ArrayList<>();

    public void addSweet(Sweet sweet){
        sweets.add(sweet);
    }

    public void remove(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        }
    }

    public void removeLast() {
        if (!sweets.isEmpty()) {
            sweets.remove(sweets.size() - 1);
        }
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweets) {
            totalWeight += sweet.weight;
        }
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Sweet sweet : sweets) {
            totalPrice += sweet.price;
        }
        return totalPrice;
    }

    public void showAllSweets() {
        for (Sweet sweet : sweets) {
            System.out.println(sweet.getDescription());
        }
    }

    public void optimizeWeight(double maxWeight) {
        sweets.sort(Comparator.comparingDouble(s -> s.weight));
        while (getTotalWeight() > maxWeight && !sweets.isEmpty()) {
            removeLast();
        }
    }

    public void optimizePrice(double maxWeight) {
        sweets.sort(Comparator.comparingDouble(s -> s.price));
        while (getTotalWeight() > maxWeight && !sweets.isEmpty()) {
            removeLast();
        }
    }
}

