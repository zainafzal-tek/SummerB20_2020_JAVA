package day54_Abstraction.CarTask;

public class ParkingLot {

    public static void main(String[] args) {

        BMW bmw = new BMW();
        bmw.start();

        Tesla tesla = new Tesla();
        tesla.start();

        Toyota toyota = new Toyota();
        toyota.start();

        Jeep jeep = new Jeep();
        jeep.start();

    }

}
