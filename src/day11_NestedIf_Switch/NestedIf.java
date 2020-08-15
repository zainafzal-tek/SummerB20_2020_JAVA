package day11_NestedIf_Switch;

public class NestedIf {

    public static void main(String[] args) {

        int score = 100;
        String result = "";

        if (score > 0 && score <= 100){ // for valid score
            if (score >= 90){
                result = "A";
            }else if (score >= 80){
                result = "B";
            }else if (score >= 70){
                result = "C";
            }else if (score >= 60){
                result = "D";
            }else if (score < 60){
                result = "F";
            }
        }else {                          // for invalid score (0>score>100)
            result = "Invalid";
        }
        System.out.println(result);

    }

}
