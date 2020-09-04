package day48_Inheritance.DeviceTask;

public class TV extends Device {

    public boolean hasRemoteControl;

    public TV(String brand, String model, double price, String screenSize, boolean hasBattery, boolean hasMemory, boolean hasRemoteControl){
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.hasRemoteControl = hasRemoteControl;
    }


    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }

}
