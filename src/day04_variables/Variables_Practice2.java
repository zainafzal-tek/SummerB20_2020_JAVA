package day04_variables;

public class Variables_Practice2 {

    public static void main(String[] args) {

        int iNum = 50;
        long lNum = iNum;

        // int iNum2 = lNum; does not compile because "int" is smaller than "long"
        float fNum = lNum;

        // float fNum = 500; does not compile because we cannot duplicate variable name

        // 1,000,000
        int num1 = 1_000_000; // Cannot use Comma in JAVA, to substitute comma we will use "_" to make number readable

        /*
        local variables: variables that are declared within he block or methods, mst be initialized to compile and before use.
         "=": assignement operator, this is used to initialize values to variables
        */




    }

}
