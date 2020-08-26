package day45_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

/*

        create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list

 */
public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Item("Apples", 4.0, 3);
        Item item2 = new Item("Bananas", 2.5, 3);
        Item item3 = new Item("Eggs", 5.2, 6);
        Item item4 = new Item("Lamb",5,10);
        Item item5 = new Item("Ice Cream",10,1);

        items.addAll(Arrays.asList(item1, item2, item3, item4, item5));

        System.out.println("Items: " + items.size());
        double totalCost = 0;

        for (Item each : items){
            totalCost += each.calcCost();    // this will calculate the total cost of each item
        }
        System.out.println("Total Price: $" + totalCost);

        System.out.println("=============================================");

        Item[] items2 = {item1, item2, item3, item4, item5};
        double totalCost2 = 0;

        for (int i = 0; i <= items2.length - 1; i++){
            totalCost2 += items2[i].calcCost();
        }

        System.out.println("Total cost2: $" + totalCost2);
    }

}
