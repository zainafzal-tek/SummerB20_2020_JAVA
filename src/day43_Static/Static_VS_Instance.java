package day43_Static;

public class Static_VS_Instance {

    static int staticVariable;
    int instanceVariable;

    public static void main(String[] args) {

        Static_VS_Instance obj1 = new Static_VS_Instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;

        Static_VS_Instance obj2 = new Static_VS_Instance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 400;

        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);

        System.out.println("=======================================");
        System.out.println(obj1.staticVariable); // 400
        System.out.println(obj2.staticVariable);// 400 since the last time the static variable is assigned to a value is 400, anyu time it is called it will remain that value untill changed again

        System.out.println(Static_VS_Instance.staticVariable);  // this is the preferred way to call a static variable
        // calling a static from the class name

    }

}
