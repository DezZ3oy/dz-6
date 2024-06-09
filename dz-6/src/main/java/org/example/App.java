package org.example;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("Toyota");
        carBrands.add("Ford");
        carBrands.add("BMW");
        carBrands.add("Mercedes");
        carBrands.add("Honda");

        String searchString = "Ford";

        boolean result = false;
        System.out.print("Марки автомобілів: ");
        for (String brand : carBrands) {
            System.out.print("| " + brand + " | ");
            if (brand.equals(searchString)) {
                result = true;
            }
        }
        System.out.println();

        System.out.println("Наявність: " + searchString + " -> " + result);
    }
}
