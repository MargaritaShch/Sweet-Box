class Marmalade extends Sweet {
    public Marmalade(String name, double weight, double price){
        super(name, weight, price);
    }

    String getDescription(){
        return "Marmalade: " + name + ", " + weight + "g., " + price + "rub.";
    }
}