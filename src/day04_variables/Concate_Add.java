package day04_variables;

public class Concate_Add {

    public static void main(String[] args) {

        //addition: number + number
        System.out.println(12+13);
        System.out.println('A'+2); //67 because 'A' is a "char" and "char" has numerical value representing the number, only applies when adding to a number
        System.out.println('A' + 'B'); // 131 because both characters are "char"

        //Concatenation: append
        System.out.println("9" + 13); //"12" is printed as a text, hence concatination will occur instead of addition
        System.out.println("A" + 2); //"A" in Double quote is text not a 'char', Concatination will occur is this case.
        System.out.println("Gender: " + 'M');//Gender: M (because we are concating to a string)
        System.out.println("Tax: " + 3.5 + '%'); //when adding string to char concatination will happen.
        System.out.println(3.5 + '%' + "Tax"); // Addition will happen (number+number'char') first then the value after adding will be concanited to the last string



    }

}
