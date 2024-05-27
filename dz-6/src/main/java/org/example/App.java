package org.example;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();
        carBrands.add("Tesla");
        carBrands.add("Ford");
        carBrands.add("Audi");
        carBrands.add("Toyota");
        carBrands.add("BMW");
        carBrands.add("Nissan");
        carBrands.add("BMW");

        removeDouble(carBrands);
    }

    public static void removeDouble(List<String> list) {
        List<String> uniqueCarBrands = new ArrayList<>();

        for (String brand : list) {
            if (!uniqueCarBrands.contains(brand)) {
                uniqueCarBrands.add(brand);
            }
        }

        System.out.println("Список авто: " + list +"\n");

        System.out.println("Результат після змін:");
        boolean isFirst = true;
        for (String brand : uniqueCarBrands) {
            if (!isFirst) {
                System.out.print(", ");
            } else {
                isFirst = false;
            }
            System.out.print(brand);
        }
    }

}