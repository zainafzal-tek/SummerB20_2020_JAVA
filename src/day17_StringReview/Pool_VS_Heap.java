package day17_StringReview;

public class Pool_VS_Heap {

    public static void main(String[] args) {

        String s1 = "Cybertek"; // String pool
        String s2 = "Cybertek"; // String pool

        //s1 and s2  are sharing the same object
        System.out.println(s1 == s2); // if they are sharing the same exact object, they will be equal to each other

        String s3  = new String("Cybertek"); // String object in HEAP.
        //s3 is not equal to neither s1 or s2 as s3 is located in the heap while s1 and s2 are in string pool

        String s4 = new String("Cybertek"); // Located in HEAP
        // s3 is not qual to s4 since they are separate objects

        System.out.println(s3 == s4); // even though they are in heap, they are separate object, hence 'false'

        String s5 = "Cybertek"; //String pool
        // JAVA is case-Sens language so s1 and s2 are the same but different from s5.

        System.out.println(s5 == s2); // false because they are different objects in the string pool
        System.out.println(s5 == s1); //                    \\



    }

}
