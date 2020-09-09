package Office_Hours.Practice_09_09_2020;

public class iPhone extends Phone {

    public iPhone(String model, double price){
        super(model, price);
    }

    public void call(long phoneNumber){
        System.out.println("iPhone " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("iPhone " + model + " is calling " + phoneNumber);
    }

    static {
        brand = "Apple";
        madeIn = "China";
    }

}
