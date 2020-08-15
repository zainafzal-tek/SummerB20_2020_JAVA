package day09_IfStatement;
/*
4. write a java program that can identify if a person is eligible to buy alcohol

 */
public class alcohol {

    public static void main(String[] args) {

        boolean hasID = true;
        int age = 21;
        boolean eligible = age >= 21 && hasID;
        boolean notEligible = age < 21;

        if (eligible){
            System.out.println("You are are eligible");
        }

        if (eligible == false){
            System.out.println("You are not eligible");
        }
    }

}
