package day20_whileLoops;

public class WhileLoop_Practice2 {

    public static void main(String[] args) {

        String str = "cybertek";

        int i = 1;
        while (i <= 5) {
            System.out.println(str);
            i++;
        }

        System.out.println("=========================================");

        String s = "cybertek";
        String result = "";

        int index = s.length()-1;
        while (index >= 0){
            result += s.charAt(index);
            index--;
        }
        System.out.println(result);

    }


}
