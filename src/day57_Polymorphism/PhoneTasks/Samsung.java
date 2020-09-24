package day57_Polymorphism.PhoneTasks;

public class Samsung extends Phone implements Downloadable, AndroidApp {

    public Samsung(String model, String size, double price) {
        super("Samsung", model, size, price);
        if (price > 1200){
            throw new RuntimeException("Samsung cannot be priced more than 1500");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println(model + " is texting " + phoneNumber);
    }

    @Override
    public void calling(long phoneNUmber) {
        System.out.println(model + " is calling " + phoneNUmber);
    }

    @Override
    public void download() {
        System.out.println(model + " is downloading " + appStoreName);
    }

    public void googleDuo(long phoneNumber){
        System.out.println(model + " is google duoing " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }

}
