package portate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pizze {
    private String name;
    private double price;
    private boolean gluten;
    private boolean lactose;


    final List<String> Ingredients = List.of("Mozzarella", "Salame Piccante", "Funghi", "Carciofi", "Prosciutto Cotto",
            "Olive", "Emmental", "Gorgonzola", "Fontina", "Parmiggiano Reggiano", "Scamorza", "Speck");
    public Pizze(String name, double price, boolean gluten, boolean lactose){
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

    public void pizzaFantasia(){
        int min = 1;
        int max = Ingredients.size();
        int range = max - min + 1;
        System.out.println("The Fantasy Pizza of the day is: ");
        for (int i = 1; i < 5; i++) {
            int random = (int)(Math.random() * range) + min;
            System.out.println("Ingredient number " + i + "is: " + Ingredients.get(i));
        }
    }
    @Override
    public String toString() {
        return name + ": " + price + "€";
    }
}