package day28_Recap;

public class FrequencyOfWords2 {

    public static void main(String[] args) {

        String str = "catcatcatdogdog";
        int countDogs = 0;
        int count = 0;
        for (int i = 0; i <= str.length() - 3; i++){
            if (str.substring(i , i + 3).equalsIgnoreCase("cat")){
                count++;
            }

            if (str.substring(i , i + 3).equalsIgnoreCase("dog")){
                countDogs++;
            }
        }
        System.out.println(count);
        System.out.println(countDogs);
    }

}
