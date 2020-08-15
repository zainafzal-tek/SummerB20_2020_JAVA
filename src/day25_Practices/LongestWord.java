package day25_Practices;

public class LongestWord {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};

        int maxLength = arr[0].length(); // 4

        for(String each : arr){

            if (each.length() > maxLength){
                maxLength = each.length();
            }

        }

        for (String each : arr){

             if (each.length() == maxLength){
                System.out.println(each);
            }

        }

    }

}
