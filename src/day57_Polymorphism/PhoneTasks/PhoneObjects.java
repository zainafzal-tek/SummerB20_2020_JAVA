package day57_Polymorphism.PhoneTasks;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("12", "5.3", 1000);
        Samsung samsung = new Samsung("S20", "6.1", 899);
        Huawei huawei = new Huawei("Robery", "5.1", 25);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        //Parent class can be referenced to create sub class object
        Phone phone1 =  new iPhone("11", "6", 1200);
        Phone phone2 = new Samsung("S8", "6.5", 900);
        Phone phone3 = new Huawei("sadasda", "3", 35);

        //parent class data type array can store any child class data type
        Phone[] phones = {iphone, samsung, huawei, phone1, phone2, phone3};

    }

}