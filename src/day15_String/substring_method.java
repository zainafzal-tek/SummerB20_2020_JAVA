package day15_String;

public class substring_method {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 012345678910

        // substring(beg index, ending index), (Index is the number of the character in the sequential order from beginning to the end of the String)
        String word1 = sentence.substring(0 , 4);
        System.out.println(word1);

        String word2 = sentence.substring(8 , 10+1); // in order to retrieve the word fun we need to add one to the ending index to be able to retrieve that character.
        System.out.println(word2);

        System.out.println("===============================");

        String sentence2 = "I like Movies and TV Series";

        String word3 = sentence2.substring(7 , 13);
        System.out.println(word3);

        System.out.println("================================");
        String firstName = "MUHTAR";
        String firstCharacter = firstName.substring(0,1);
        String restOfCharacters = firstName.substring(1,firstName.length());
        String converted = restOfCharacters.toLowerCase();
        System.out.println(firstCharacter + converted);


    }

}
