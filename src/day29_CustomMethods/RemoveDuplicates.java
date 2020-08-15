package day29_CustomMethods;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbcccccccccdddddddeeeeee";

        removeDup(str);

    }

    public static void removeDup(String str){
        String nonDup = "";

        for (String each : str.split("")){
            if (!nonDup.contains(each)){
                nonDup += each;
            }
        }

        System.out.println(nonDup);
    }

}
