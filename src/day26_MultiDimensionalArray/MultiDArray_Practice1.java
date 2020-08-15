package day26_MultiDimensionalArray;

public class MultiDArray_Practice1 {

    public static void main(String[] args) {

        int[][] scores = {{10, 20,30 ,40 ,45}, {60, 55,75, 105}, {93, 48, 125 ,135}};

        for (int[] each1dArray : scores){
            for (int each : each1dArray)
             if (each % 3 == 0 || each  % 5 ==0){
                 System.out.println(each + " ");
             }
        }

    }

}
