package day10_IfStatements;

public class Character_Identify {

    public static void main(String[] args) {

        char character = '1';

        boolean isAlphabetic = character >= 65 && character <= 90 || character >= 97 && character <= 122;

        String alphabet = "";

        if (isAlphabetic){
            alphabet = character + " is alphabet character";
                //System.out.println(character + " is alphabetic");
        }else{
            alphabet = character + " is not alphabet character";
                //System.out.println(character + " is not alphabetic");
        }

        System.out.println(alphabet);

        boolean isDigit = character >= 48 && character <= 57;
        String digit = "";

        if (isDigit){
            digit = character + " is a digit";
        }else {
            digit = character + " is not a digit";
        }
        System.out.println(digit);

        boolean specialChar = !isAlphabetic && !isDigit;
        String specChar = "";

        if (specialChar){
            specChar = character + " is a special character";
        }else{
            specChar = character + " is not a special character";
        }
        System.out.println(specChar);

    }

}
