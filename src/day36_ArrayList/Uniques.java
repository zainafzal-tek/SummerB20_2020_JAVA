package day36_ArrayList;

import javax.swing.*;
import java.util.ArrayList;

/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}

 */
public class Uniques {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> uniques = new ArrayList<>();

      // for (int i = 0; i <= list.size() -1; i++)
      for (Integer element : list) // gets element from list
        {
            int count = 0;
           // Integer element = list.get(i);

            for (Integer each : list) { // finds frequency of element
                if (each == element) {
                    count++;
                }
            }

            if (count == 1) { // to verify freq of element is 1
                uniques.add(element); // adds unique element to list
            }
        }
        System.out.println(uniques);
    }

}
