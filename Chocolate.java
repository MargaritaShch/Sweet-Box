class Chocolate extends Sweet {
    public Chocolate(String name, double weight, double price){
        super(name, weight, price);
    }

    String getDescription(){
        return "Chocolate: " + name + ", " + weight + "g., " + price + "rub.";
    }
}