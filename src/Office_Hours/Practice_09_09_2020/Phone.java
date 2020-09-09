package Office_Hours.Practice_09_09_2020;

public class Phone {

    public static String brand;
    public static String madeIn;

    public String model;
    public double price;

    public Phone(String model, double price){
        this.model  = model;
        this.price = price;
    }

    protected void call(long phoneNumber){
        System.out.println("Phone is calling: "+phoneNumber);
    }

    protected void text(long phoneNumber){
        System.out.println("Phone is texting to: "+phoneNumber);
    }

    public String toString(){
        return "Brand: "+brand+" Model: "+model+" Price: $"+price+" Made in: "+madeIn;
    }

}
