package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiD_Array {

    public static void main(String[] args) {

        char[] ch1 = {'A' , 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};

        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
        //  index of array     0            1               2

        System.out.println(Arrays.toString(ch2D[1]));

        System.out.println(Arrays.toString(ch2D[2]));

        System.out.println(ch2D[2][2]);

        System.out.println(ch2D[1][0]);

        System.out.println(ch2D[2][1] + " " + ch2D[0][1]);

        for (int i = 0; i <= ch2D.length- 1; i++){
            System.out.println(Arrays.toString(ch2D[i]));
        }

        System.out.println(Arrays.deepToString(ch2D));

    }

}
