package day61_Maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveMaps {

    public static void main(String[] args) {

        String[] words = {"Java", "Python", "Level", "Kayak", "Cybertek", "Zoman", "Ana", "Batch 20"};

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));

        System.out.println(list);

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String each = it.next();
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--){
                reverse += each.charAt(i);
            }
            System.out.println(each + " : " + reverse);

            if (reverse.equalsIgnoreCase(each)){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("============================================");



    }
}
