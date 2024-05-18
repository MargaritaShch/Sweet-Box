public interface SweetBox {
    void addSweet(Sweet sweet);
    void remove(int index);
    void removeLast();
    double getTotalWeight();
    double getTotalPrice();
    void showAllSweets();
}