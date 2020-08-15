package day10_IfStatements;

public class GradeCalculater {

    public static void main(String[] args) {

        int score = 101;
        String grade = "";

        boolean aGrade = score >= 90 && score <= 100;
        boolean bGrade = score >= 80 && score < 90;
        boolean cGrade = score >= 70 && score < 80;
        boolean dGrade = score >= 60 && score < 70;
        boolean fGrade = score >= 0 && score < 60;


        if (aGrade){
            grade = "A";
        }else if (bGrade){
            grade = "B";
        }else if (cGrade){
            grade = "C";
        }else if (dGrade){
            grade = "D";
        }else if (fGrade){
            grade = "F";
        }else {
            grade = "Invalid Input";
        }

        System.out.println(grade);



    }

}
