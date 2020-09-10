package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException {

    public InvalidBrowserNameException(){
        super("Invalid Browser!");
    }

    public InvalidBrowserNameException(String message){
        super(message);
    }

}

class Test2{

    public static void main(String[] args) {

        String name = "cybertek";

        switch (name){
            case "chrome":
                System.out.println("Chrome browser is selected");
                break;

            case "firefox":
                System.out.println("Firefox browse is selected");
                break;

            case "safari":
                System.out.println("Safari browser is selected");
                break;

            default:
                throw new InvalidBrowserNameException();
        }

    }

}