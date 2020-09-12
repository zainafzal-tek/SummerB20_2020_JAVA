package day53_FinalKeyword;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(){
        super("Its time for a break");
        System.err.println("Its time to go home");
    }

    public BreakTimeException(String message){
        super(message);
        System.err.println("Time to take 15 minute break");
    }
}

class Test{
    public static void main(String[] args) {

        //throw new RuntimeException("This is Runtime Exception");
        //throw new BreakTimeException("Give us a break");

        throw new BreakTimeException("Its been 45 minutes");
    }
}
