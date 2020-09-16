package day54_Abstraction.CarTask;

public class BMW extends Car {

    // in abstraction, Method from parent class MUST be overridden!
    @Override
    public void start() {
        System.out.println("Starting BMW by: Press start button");
    }

}
