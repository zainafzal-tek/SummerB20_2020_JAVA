package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> employees = new LinkedHashMap<>();
        //.put sets key and value to the map:
                      // Key     Value
        employees.put("Elvira", 100000.0);
        employees.put("Ziiadin", 120000.0);
        employees.put("Roman", 130000.0);
        employees.put("Cihan", 150000.0);
        employees.put("Nurbiya", 125009.0);
        //Keys cannot be duplicated, values can be duplicated

        System.out.println(employees);
        System.out.println(employees.size());

        //.get("key"): return the value from the map:
        System.out.println("Salary of Ziiadin = " + employees.get("Ziiadin"));

        //.remove("key"): remove the data from the map:
        employees.remove("Ziiadin");
        System.out.println(employees);

        //.containsKay("key"): checks if key is in the map and returns boolean:
        boolean r1 = employees.containsKey("Roman");
        System.out.println(r1);

        //.containsValue(Value): checks if value is contained in the map and returns boolean:
        boolean r2 = employees.containsValue(150000.0);
        System.out.println(r2);

        boolean r3 = employees.containsValue(130000.0);
        System.out.println(r3);

        //.clear: this method will clear the map, this clears everything meaning the size will be zero;
        employees.clear();
        System.out.println(employees.size());

        //.isEmpty: this method will check if the map is empty or not, returns boolean:
        boolean r4 = employees.isEmpty();
        System.out.println(r4);

    }

}
