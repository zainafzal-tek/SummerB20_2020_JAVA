package day57_Polymorphism.PhoneTasks;

public class Huawei extends Phone implements AndroidApp, AppleApp, Downloadable{

    public Huawei(String model, String size, double price) {
        super("Huawei", model, size, price);
        if (price > 200){
            throw new RuntimeException("No way Huawei isn't worth 200");
        }
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println(brand + model + " is texting " + phoneNumber);
    }

    @Override
    public void calling(long phoneNUmber) {
        System.out.println(brand + model + " is calling " + phoneNUmber);
    }

    @Override
    public void download() {
        System.out.println(brand + model + " is downloading from both " + AndroidApp.appStoreName + " and " + AppleApp.appStoreName);
    }

    public void stealInfo(){
        System.out.println(brand + model + " is stealing your information");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }

}
