package Portate;
public class Pizze {
    private String name;
    private double price;

    public Pizze(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void printPizza(){
        System.out.print("Name of the pizza: " + name);
        System.out.println(" || Price of the pizza:" + price);
    }

    @Override
    public String toString() {
        return name + " |--| " + price + " €";
    }
}