package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9));

//        Predicate<Integer> lessThan5 = p -> p < 5;  // lambda statement.
                                    // syntax  |  boolean experession

        list.removeIf(p -> p < 5);
        System.out.println(list);

        System.out.println("===================================");

        ArrayList<Integer> list2 = new ArrayList<>();
      for (int i = 0; i <= 100; i++){
          list2.add(i);
        }

        Predicate<Integer> oddNum = p -> p % 2 != 0;
        //list2.removeIf(divBy3);   will remove if num is odd
        list2.removeIf(p -> p % 2 == 0); // will remove if num is even
        System.out.println(list2);


        System.out.println("===================================");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"));
        System.out.println(names);

        names.removeIf(p -> p.startsWith("M"));
        System.out.println(names);

        System.out.println("========================================");

        ArrayList<Integer> numList = new ArrayList<>();

        numList.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3 ,4 , 5, 6, 7, 8, 8, 9));

        numList.removeIf(p -> Collections.frequency(numList, p) != 1); // will remove elements that are not unique
        //                    this is the boolean expression for elements that are not unique

        System.out.println(numList);



    }

}
