package day57_Polymorphism.PhoneTasks;

public abstract class Phone {

    public String brand, model, size;
    public double price;

    public Phone(String brand, String model, String size, double price){
        this.brand = brand;
        this.model = model;
        this.size = size;
        if (price <= 0){
            throw new RuntimeException("Price of phone cannot be zero or less than zero");
        }
        this.price = price;
    }

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNUmber);

}
