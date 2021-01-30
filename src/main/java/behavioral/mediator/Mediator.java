package behavioral.mediator;

public class Mediator {

    private Button button;
    private Fan fan;
    private PowerSupplier supplier;

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

    public void setButton(Button button) {
        this.button = button;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setSupplier(PowerSupplier supplier) {
        this.supplier = supplier;
    }
}
