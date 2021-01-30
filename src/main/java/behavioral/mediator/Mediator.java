package behavioral.mediator;

public class Mediator {

    Button button = new Button(this);
    Fan fan = new Fan(this);
    behavioral.mediator.fan_simulation.PowerSupplier supplier = new behavioral.mediator.fan_simulation.PowerSupplier();

    public Mediator() {

    }

    public boolean isFanOn() {
       return fan.isOn();
    }

    public void turnOffFan() {
        fan.turnOff();
    }

    public void turnOnFan() {
        fan.turnOn();
    }

    public void startSupplier() {
        supplier.start();
    }

    public void stopSupplier() {
        supplier.stop();
    }
}
