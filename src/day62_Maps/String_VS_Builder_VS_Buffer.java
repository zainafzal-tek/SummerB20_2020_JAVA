package day62_Maps;

public class String_VS_Builder_VS_Buffer {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1.concat(" School");
        System.out.println(str1); // immutable

        System.out.println("===================================");

        String str2 = new String("Cybertek");
        StringBuilder sb = new StringBuilder("Cybertek");
            sb.append( " School");
            sb.reverse();

        System.out.println(sb);
        System.out.println("=======================================");

        String name = "Level";
        String reversedName = new StringBuilder(name).reverse().toString();
        System.out.println(name.equalsIgnoreCase(reversedName));

        System.out.println("======================================");

        //Converting from string to string Builder:
        String s1 = "Friday";
        StringBuilder s2 = new StringBuilder(s1);

        //Convert StringBuilder to string:
        String s3 = s2.toString();

    }

}
