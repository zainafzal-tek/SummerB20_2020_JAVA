package day11_NestedIf_Switch;

public class Ternary_Practice2 {

    public static void main(String[] args) {

        int num = 100;

        String result = num > 0 ? "Positive" : num < 0 ? "Negative" : "Zero"; //condition always needs to be placed before ?.
        System.out.println(result);


    }

}
