package day57_Polymorphism.PhoneTasks;

public class iPhone extends Phone implements AppleApp, Downloadable {

    public iPhone(String model, String size, double price){
        super("Apple", model, size, price);
        if (price > 1500){
            throw new RuntimeException("iPhone cannot be priced more than 1500");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println(model + " is texting " + phoneNumber);
    }

    @Override
    public void calling(long phoneNUmber) {
        System.out.println(model + " is calling" + phoneNUmber);
    }

    @Override
    public void download() {
        System.out.println(model + " is downloading from " + appStoreName);
    }

    public void faceTiming(long phoneNumber){
        System.out.println(model + " is facetiming " + phoneNumber);
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }

}
