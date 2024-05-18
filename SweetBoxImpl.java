import java.util.ArrayList;
import java.util.Comparator;

class SweetBoxImpl implements SweetBox {
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
            sweets.remove(0);
        }
    }

    public void optimizePrice(double maxWeight) {
        sweets.sort(Comparator.comparingDouble(s -> s.price));
        while (getTotalWeight() > maxWeight && !sweets.isEmpty()) {
            sweets.remove(0);
        }
    }
}