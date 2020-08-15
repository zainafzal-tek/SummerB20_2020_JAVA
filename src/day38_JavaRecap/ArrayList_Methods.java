package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    // remove, size, get, set, equals, contains, clear
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Infinity", "Tesla", "VW", "Lamorghini", "Lexus", "Tesla", "Tesla"));

        //cars.remove("Tesla")
        //cars.removeAll(Arrays.asList("Tesla")); removes all that match with collection type

        //cars.removeIf(p -> p.toLowerCase().contains("m"));/

        //cars.retainAll(Arrays.asList("Tesla")); removes all that do not match

        System.out.println(cars);

        System.out.println("==========================================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll( Arrays.asList("Eggs", "Milk", "Paper Towels", "Toilet Paper", "Mango", "Orange", "Avocado", "Dragon Fruit")  );

        // pepsi
        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);

        // Eggs, Milk, Orange, Water
        boolean r2 = groceryList.containsAll( Arrays.asList("Eggs", "Orange", "Milk", "Water") );
        System.out.println(r2);

        System.out.println("Total Number of Items: "+ groceryList.size());

        // set the dragon fruit to apple:
        groceryList.set(groceryList.size()-1 ,  "Apple" );
        groceryList.set( groceryList.indexOf("Paper Towels") ,  "Dish Washer");

        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);

    }

}
