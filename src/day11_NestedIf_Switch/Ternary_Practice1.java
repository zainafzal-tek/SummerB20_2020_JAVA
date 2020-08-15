package day11_NestedIf_Switch;

public class Ternary_Practice1 {

    public static void main(String[] args) {

        int age = 25;
        String citizen = "USA";

        String result = "";

        if (age == 21 && citizen == "USA"){
            result = "Can Vote";
        }else{
            result = "Cannot Vote";
        }
        System.out.println(result);

        String result2 = (age == 21 && citizen == "USA") ? "Can Vote" : "Cannot Vote";
        System.out.println(result2);

        System.out.println("===================================");

        int n1 = 100;
        int n2 = 200;
        String r = (n1 == n2) ? "Equal" : "Not Equal";
        System.out.println(r);

        // In ternary the number of ? conditions must be equal to the total number of : conditions

        int num = 100;


    }

}
