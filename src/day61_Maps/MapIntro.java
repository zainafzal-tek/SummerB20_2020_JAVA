package day61_Maps;

import java.util.*;

public class MapIntro {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();// Random insertions order

        Map<String, Integer> map2 = new TreeMap<>();// always sorted

        Map<String, Integer> map3 = new LinkedHashMap<>(); // keeps insertion order as it is

        Map<String, Integer> map4 = new Hashtable<>(); //synchronised insertion order (thread safe)



    }

}
