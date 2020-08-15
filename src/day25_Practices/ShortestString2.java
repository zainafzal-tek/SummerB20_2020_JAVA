package day25_Practices;

public class ShortestString2 {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int minLength = arr[0].length();     // 4

        for (String each : arr ){      // to find out the min length of the string in the array


            if (each.length() < minLength){
                minLength = each.length();
            }

        }


        for (String each : arr){

            if (each.length() == minLength){
                System.out.println(each);
            }

        }




    }

}
