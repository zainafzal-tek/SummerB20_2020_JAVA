package day24_Arrays;

public class UniqueNumbers2 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3};

        for (int a: arr){

            int count = 0;

            for (int b: arr){
                if (b == a){
                    count++;
                }
            }

            if (count == 1){
                System.out.print(a + " ");
            }
        }

    }

}
