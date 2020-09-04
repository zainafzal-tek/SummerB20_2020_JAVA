package day48_Inheritance.DeviceTask;

public class Laptop extends Device {

    public static boolean hasCPU;
    public static boolean hasMouse;
    public static boolean hasKeyBoard;

    public String OS;

    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize, String OS){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.OS = OS;
    }

    public void coding(String language){
        System.out.println("coding "+language+" in "+brand+" "+model);
    }

}
