package day03_sequences_Variables;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Hello Everyone \n\tMy name is Cybertek");
        System.out.println("\t\tI am in Virginia");
        System.out.println("\n\n\t\t\tI love programming");

        System.out.println("\\\\\n");


        System.out.println("My name is \'Zain\'");
        System.out.println("My name is 'Zain'"); // This will still print quotes

        System.out.println("\nMy favorite TV-Series: \"Game of Thrones\"");
        //Using escape sequence is the only way to print double quote




        /* \n: adds new line (Appends New Line)
            \t: adds paragraph spacing (Paragraph Indention)
             Escape Sequences can be stacked as many times as you want
             \\: This escape sequence prints a BackSlash. (Appends Backslash)
                 To print a back slash you need to use the escape sequence otherwise compiler error will occur.
                 To print a front slash there is no need to type it 2 times.
             \': Causes a single quote mark to be printed
             \": Causes Double quote mark to be printed (This is the only way to print Double quote)
         */


    }


}
