package day60_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterable_Practice2 {

    public static void main(String[] args) {

        String[] arr = {"Ahmed", "Aalia", "Azbal", "Ahmed", "Virginia", "Ahmed", "Ahmed"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));
        Iterator<String> it = names.iterator();

        //iterating through arraylist using while loop adn iterator
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("Ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("=====================================");

        //iterating through Arraylist using regular for loop and iterator
        ArrayList<String> employee = new ArrayList<>(Arrays.asList(arr));
        for (Iterator<String> i = employee.iterator(); i.hasNext();){
            if (i.next().equalsIgnoreCase("Ahmed")){
                i.remove();
            }
        }
        System.out.println(employee);
        System.out.println("======================================");

        //using removeIf (predicate lambda expression) to remove object, iterator is done automatically when using predicate!
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(p -> p.equalsIgnoreCase("Ahmed"));
        System.out.println(list);

    }

}
