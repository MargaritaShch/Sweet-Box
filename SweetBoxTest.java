public class SweetBoxTest {
    public static void main(String[] args) {
        Sweet marmalade = new Marmalade("Fruit Jelly", 150, 120);
        Sweet candy = new Candy("Mint Candy", 50, 70);
        Sweet chocolate = new Chocolate("Dark Chocolate", 200, 250);

        // create sweet-box
        SweetBoxImpl sweetBox = new SweetBoxImpl();

        // add sweets
        sweetBox.addSweet(marmalade);
        sweetBox.addSweet(candy);
        sweetBox.addSweet(chocolate);

        // info after optimization
        System.out.println("Before optimization:");
        sweetBox.showAllSweets();
        System.out.println("Total weight: " + sweetBox.getTotalWeight() + "g");
        System.out.println("Total price: " + sweetBox.getTotalPrice() + "rub");

        // optimization weight
        System.out.println("\nOptimizing weight to max 300g:");
        sweetBox.optimizeWeight(300);
        sweetBox.showAllSweets();
        System.out.println("Total weight after weight optimization: " + sweetBox.getTotalWeight() + "g");

        // optimization cost
        sweetBox.addSweet(marmalade);
        sweetBox.addSweet(candy);
        sweetBox.addSweet(chocolate);
        System.out.println("\nOptimizing price to max 300 rub:");
        sweetBox.optimizePrice(300);
        sweetBox.showAllSweets();
        System.out.println("Total price after price optimization: " + sweetBox.getTotalPrice() + "rub");
    }
}