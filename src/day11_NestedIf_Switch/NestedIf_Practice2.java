package day11_NestedIf_Switch;

public class NestedIf_Practice2 {

    public static void main(String[] args) {

        double salary = 120_000;
        int jobHistory = 5;

        if (salary >= 30_000){
            if (jobHistory >= 2){
                System.out.println("You are qualified");
            }else {
                System.out.println("You must need more than 2 years on Job");
            }
        }else {
            System.out.println("You MUST earn $30K");
        }

        System.out.println("==================================");



    }
}