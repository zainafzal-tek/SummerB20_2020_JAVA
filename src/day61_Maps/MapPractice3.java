package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("East Turkey", "Kashgar");
        countries.put("East Turkistan", "Tashkan");
        countries.put("Kyrgystan", "Bishkik");
        countries.put("Spain", "Madrid");
        countries.put("Ukrain", "Kiev");
        countries.put("Azerbajan", "Karabagh");
        countries.put("Turkey", "Ankara");

        for (String eachKey : countries.keySet()) {
            String eachValue = countries.get(eachKey);
            System.out.println("Country name: " + eachKey + " , Capital name: " + eachValue);
        }

    }

}
