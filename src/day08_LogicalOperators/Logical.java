package day08_LogicalOperators;

public class Logical {

    public static void main(String[] args) {
        // !: Always return the opposite boolean (CAN ONLY BE APPLIED TO BOOLEAN)
        boolean r1 = 9 > 7; // true
        boolean r2 = !r1; // this will return false due to "!" (opposite operator being put)
        System.out.println( r1 + " : " +r2);

        System.out.println( !false ); // true
        System.out.println( !true); // false

        boolean r3 = !false == true; // !false will convert into true, hence true == true
        System.out.println(r3);

        boolean r4 = true == !true; // true == true (!false converted into true)
        System.out.println(r4);

        // &&: AND logic, in order to return true, both expressions must be true

        boolean r5 = 9>5 && 9 > 10;
        //           true && false
        //           = false

        // ||: OR logic, will always return true unless both conditions are false

        boolean r8 = true == !false || false == true;
        //              true || false
        //              = true

        boolean r9 = !false == false || true == !false;
        //              false       ||      true
        //              =   true




    }

}
