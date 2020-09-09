package Office_Hours.Practice_09_09_2020;

public class Samsung extends Phone {

    public Samsung(String model, double price){
        super(model, price);
    }

    public void call(long phoneNumber){
        System.out.println("Samsung " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Samsung " + model + " is texting " + phoneNumber);
    }

    static{
        brand = "Samsung";
        madeIn = "Korea";
    }

}
