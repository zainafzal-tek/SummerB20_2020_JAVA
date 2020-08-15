package day13_Scanner;
/*
write a program that can display the selected browser
            1.1  declear a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary

 */

public class SelectedBrowser {

    public static void main(String[] args) {

        String browserName = "firefox";
        String result = "";

        switch (browserName){
            case "chrome":
                result = "Chrome";
                break;

            case "firefox":
                result = "Firefox";
                break;

            case "opera":
                result = "Opera";
                break;

            case "safari":
                result = "Safari";


            case "edge":
                result = "Edge";

            default:
                result = "Invalid Browser Name";
                break;

        }

        System.out.println(result);

    }

}
