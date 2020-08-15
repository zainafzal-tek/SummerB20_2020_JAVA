package day20_whileLoops;

public class BranchingStatements {

    public static void main(String[] args) {

        char ch = 'A';
        while (ch <= 'E'){

            if (ch == 'C') {
                ch++;
                continue; // skips everything, EVEN the iterator, in while loop
            }

            System.out.println(ch);
            ch++;
        }

/*
        if (true) {
            System.exit(0); // exits the entire program (Shuts the JVM down). status 0 means 0 exit codes
        }
*/

        while (true){
            System.out.println("Test Started");
            break;
        }

    }

}
