package day61_Maps;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MapPractice2 {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Elvira", 89);
        students.put("Ziiadin", 92);
        students.put("Roman", 98);
        students.put("Cihan", 74);
        students.put("Nurbiya", 93);

        //LinkedHashMap<String, Integer> earlyBirds = new LinkedHashMap<>();
        //LinkedHashMap<String, Integer> angryBirds = new LinkedHashMap<>();

        List<String> earlyBirdsList = new ArrayList<>();


        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);

            if (eachValue >= 90) {
                earlyBirdsList.add(eachKey);
            }

            /*if (eachValue >= 95){
                earlyBirds.put(eachKey, eachValue);
            } else {
                angryBirds.put(eachKey, eachValue);
            }
        }*/

        }

        System.out.println(earlyBirdsList);

    }

}
