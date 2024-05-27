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


        String searchString = "BMW";

        boolean result = contains(carBrands, searchString);
        System.out.println("Наявність: " + searchString + " -> " + result);
    }

    public static boolean contains(ArrayList<String> list, String target) {
        System.out.print("Марки автомобілів: ");
        for (String element : list) {
            System.out.print("| " +element + " | ");
        }
        System.out.println();

        for (String element : list) {
            if (element.equals(target)) {
                return true;
            }
        }

        return false;
    }

}