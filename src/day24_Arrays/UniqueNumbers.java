package day24_Arrays;

public class UniqueNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3};

        for (int j = 0; j <= arr.length-1; j++){

            int num1 = arr[j];

            int count = 0;
            for (int i  = 0; i <= arr.length-1; i++){
                int each = arr[i];
                if (each == num1){
                    count++;
                }
            }

            if (count == 1){
                System.out.println(num1);
            }
        }



    }

}
