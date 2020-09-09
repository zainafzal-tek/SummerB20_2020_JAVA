package Office_Hours.Practice_09_09_2020;

public class Nokia extends Phone {

    public Nokia(String model, double price){
        super(model, price);
    }

    static {
        brand = "Nokia";
        madeIn = "Finland";
    }

    public void call(long phoneNumber){
        System.out.println("Nokia "+model+" is calling: "+phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Nokia "+model+" is texting to: "+phoneNumber);
    }

}
